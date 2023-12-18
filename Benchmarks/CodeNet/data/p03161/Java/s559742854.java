import java.io.*;
import java.util.*;

public class Main{

        public static void main(String[] args) throws Exception{

            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;

            InputReader in = new InputReader(inputStream);
            PrintWriter out = new PrintWriter(outputStream);

            Task solver = new Task();
            solver.solve(in,out);
            out.close();
        }

        static class Task{

            public void solve(InputReader in, PrintWriter out){

                int n = in.nextInt();
                int k = in.nextInt();
                int[] costs = new int[n];
                long[] result = new long[n];

                for(int i = 0;i<n;i++){
                    costs[i] = in.nextInt();
                }

                Arrays.fill(result, Long.MIN_VALUE);
                //out.println(go(costs, 0));
                //out.println(goIter(costs, result, 0));
                //out.println(goIter2(costs, k));
                out.println(goIter(costs, result, 0, k));
            }

            // public long goRec(int[] costs, int step){

            //     if(step >= costs.length)
            //         return Long.MAX_VALUE;

            //     if(step == costs.length-1)
            //         return 0;

            //     long one_step_value = goRec(costs, step+1);
            //     if(step < costs.length - 1)
            //         one_step_value += Math.abs(costs[step] - costs[step+1]);
            //     long two_steps_value = goRec(costs, step+2);
            //     if(step < costs.length - 2)
            //         two_steps_value += Math.abs(costs[step] - costs[step+2]);

            //     return Math.min(one_step_value, two_steps_value);

            // }

            public long goIter(int[] costs, long[] result, int step, int k){
                if(step >= costs.length)
                    return Long.MAX_VALUE;

                if(result[step] != Long.MIN_VALUE)
                    return result[step];

                if(step == costs.length-1)
                    return 0;

                long ans = Long.MAX_VALUE;
                for(int i = 1;i<=k;i++){
                    long local_ans = goIter(costs, result, step+i, k);
                    if(step < costs.length - i)
                        local_ans += Math.abs(costs[step] - costs[step+i]);

                    ans = Math.min(ans, local_ans);
                }

                return (result[step] = ans);
            }

            // public long goIter2(int[] costs, int k){

            //     long[] result = new long[costs.length];

            //     result[costs.length-2] = Math.abs(costs[costs.length-1] - costs[costs.length-2]);

            //     for(int i = costs.length-3;i >= 0;i--){
            //         long ans = Long.MAX_VALUE;
            //         for(int j = 1;j<=k && (i+j) < costs.length;j++){
            //             ans = Math.min(result[i+j]+Math.abs(costs[i]-costs[i+j]), ans);
            //         }
            //         result[i] = ans;
            //     }
            //     //System.out.println(Arrays.toString(result));
            //     return result[0];
            // }
        }

        static class InputReader{

            BufferedReader reader;
            StringTokenizer tokenizer;

            public InputReader(InputStream inputStream){

                reader = new BufferedReader(new InputStreamReader(inputStream));
                tokenizer = null;

            }

            public String next(){
                while(tokenizer == null || !tokenizer.hasMoreTokens()){
                    try{
                        tokenizer = new StringTokenizer(reader.readLine());
                    }
                    catch(IOException e){
                        throw new RuntimeException(e);
                    }
                }

                return tokenizer.nextToken();
            }

            public int nextInt(){
                return Integer.parseInt(next());
            }
        }
}
