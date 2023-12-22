import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main implements Runnable{
    public static void main(String[] args) {
	    new Thread(null, new Main(),"Main",1<<27).start();
    }
    @Override
    public void run() {
        FastReader fd = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        long n = fd.nextLong();
        long k = fd.nextLong();
        HashMap<Long,Long> data = new HashMap<>();
        long key = 1;
        for(int te = 1; te <= n; te++){
            data.put(key++,fd.nextLong());
        }
        ArrayList<Long> visited = new ArrayList<>();
        long start = 1;
        long current;
        while (!visited.contains(data.get(start))) {
            current = data.get(start);
            start = current;
            visited.add(current);
            k--;
        }
        int temp =  visited.size() - visited.indexOf(data.get(visited.get(visited.size()-1)));
        int index = (int) (k%temp);
        int extra = visited.size()-temp;
        index--;
        out.println(visited.get(index+extra));
        out.close();
    }


    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
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

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
