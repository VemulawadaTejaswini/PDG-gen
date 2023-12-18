import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader fs = new FastReader();

        int maxElevation = Integer.MAX_VALUE;
        HashMap<Integer,Node> atcoder = new HashMap<>();
        int obs = fs.nextInt();
        int hills = fs.nextInt();
        for (int i = 1; i <=obs; i++) {
            int elev = fs.nextInt();
            atcoder.put(i,new Node(elev));
            maxElevation = Math.max(maxElevation,elev);
        }
        for (int i = 1; i <=hills; i++) {
            int a = fs.nextInt();
            int b=fs.nextInt();
            //for a
            int aNeiEle = atcoder.get(b).hillElevation;
            Node aNode = atcoder.get(a);
            aNode.addNeighbor(aNeiEle);

            //for b
            int bNeiEle = atcoder.get(a).hillElevation;
            Node bNode = atcoder.get(b);
            bNode.addNeighbor(bNeiEle);
        }
        int counter =0;
        for(int ob:atcoder.keySet()){
            Node obNode = atcoder.get(ob);
            if(obNode.minNeiborElevation==Integer.MIN_VALUE || obNode.hillElevation >obNode.minNeiborElevation ){
                counter++;
            }
        }
        System.out.println(counter);
    }
    static class Node{
        int hillElevation;
        int minNeiborElevation = Integer.MIN_VALUE;
        Node(int hillElevation){
            this.hillElevation =hillElevation;
        }
        public void addNeighbor(int neigborEle){
            this.minNeiborElevation = Math.max(this.minNeiborElevation,neigborEle);
        }
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
