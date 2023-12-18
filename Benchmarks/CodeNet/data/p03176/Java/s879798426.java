import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader inp = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solver solver = new Solver();
        solver.solve(inp, out);
        out.close();
    }

    private static class Solver {
        private void solve(InputReader inp, PrintWriter out) {
            int n = inp.nextInt();
            long[] dp = new long[n+1];
            int[] h = new int[n];
            int[] v = new int[n];
            for (int i = 0; i < n; i++) h[i] = inp.nextInt();
            for (int i = 0; i < n; i++) v[i] = inp.nextInt();

            SegmentTreeLazy st = new SegmentTreeLazy(dp);

            for (int i = 0; i < n; i++) {
                int height = h[i];
                long value = v[i] + st.queryMax(0, height - 1);
                st.update(height, height, value);
            }

            out.println(st.queryMax(0, n));
        }

        public class SegmentTreeLazy {
            int size;
            private long[] max;

            private long[] lazy;


            public SegmentTreeLazy(long[] array){
                size = array.length;
                max=new long[array.length*4];
                lazy=new long[array.length*4];
                buildTree(array,1,0,size-1);
            }

            private void buildTree(long[] array, int position, int front, int end){
                //Basis case for returning the elements itself
                if(front==end){
                    max[position]=array[front];
                    return;
                }
                //Building trees by dividing into two subtrees
                buildTree(array, position*2,front,(front+end)/2);
                buildTree(array, position*2+1,(front+end)/2+1,end);

                recalc(position,front,end);
            }

            private void recalc(int position, int front, int end) {
                max[position]=Math.max(getMax(position*2),getMax(position*2+1) );
            }

            private long getMax(int position){
                return Math.max(max[position], lazy[position]);
            }

            public long queryMax(int queryFront, int queryEnd) {
                return queryMax(1,0,size-1,queryFront,queryEnd);
            }

            private long queryMax(int position,int front,int end, int queryFront, int queryEnd){
                //Case for entirely inclusive
                if(front>=queryFront&&queryEnd>=end){
                    return getMax(position);
                }
                //Case for entirely exclusive
                if(end<queryFront||queryEnd<front){
                    return Integer.MIN_VALUE;
                }
                propagate(position,front,end);
                long leftAns=queryMax(position*2,front,(front+end)/2,queryFront,queryEnd);
                long rightAns=queryMax(position*2+1,(front+end)/2+1,end,queryFront,queryEnd);
                return Math.max(leftAns, rightAns);
            }


            private void propagate(int position,int front, int end){
                lazy[position*2] = Math.max(lazy[position*2], lazy[position]);
                lazy[position*2+1] = Math.max(lazy[position*2+1], lazy[position]);
                max[position]=getMax(position);
                lazy[position]=0;
                //Set the propagation to 0 so that it will not propagate the value again and again
            }

            public void update(int updateFront, int updateEnd, long value){
                update(1,0,size-1,updateFront,updateEnd,value);
            }

            private void update(int position, int front, int end, int updateFront,int updateEnd,long value){
                //Case for entirely inclusive
                if(front>=updateFront&&updateEnd>=end){
                    lazy[position] = Math.max(lazy[position], value);
                    return;
                }
                //Case for entirely exclusive
                if(end<updateFront||updateEnd<front){
                    return;
                }
                propagate(position,front,end);
                update(position*2,front,(front+end)/2,updateFront,updateEnd,value);
                update(position*2+1,(front+end)/2+1,end,updateFront,updateEnd,value);
                recalc(position,front,end);
            }
        }
    }

    static class InputReader {
        BufferedReader reader;
        StringTokenizer tokenizer;

        InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}


