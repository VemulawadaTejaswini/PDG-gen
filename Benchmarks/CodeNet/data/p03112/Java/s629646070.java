import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = sc.nextInt();
        TreeSet<Integer> shrines = new TreeSet<Integer>();
        TreeSet<Integer> temples = new TreeSet<Integer>();
        for (int i = 0; i < a; i++) {
            shrines.add(sc.nextInt());
        }
        for (int i = 0; i < b; i++) {
            temples.add(sc.nextInt());
        }
        for (int i = 0; i < q; i++) {
            int d = sc.nextInt();
            int min = (1<<30);
            int dist = 0;
            Integer closeShrine = 0;
            Integer closeTemple = 0;

            closeShrine = shrines.ceiling(d);
            if (closeShrine != null) {
            dist += Math.abs(closeShrine - d);
                closeTemple = temples.ceiling(closeShrine);
                if (closeTemple != null) {
                    dist += Math.abs(closeTemple - closeShrine);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeTemple = temples.ceiling(d);
            if (closeTemple != null) {
                dist += Math.abs(closeTemple - d);
                closeShrine = shrines.ceiling(closeTemple);
                if (closeShrine != null) {
                    dist += Math.abs(closeShrine - closeTemple);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeShrine = shrines.floor(d);
            if (closeShrine != null) {
                dist += Math.abs(closeShrine - d);
                closeTemple = temples.floor(closeShrine);
                if (closeTemple != null) {
                    dist += Math.abs(closeTemple - closeShrine);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeTemple = temples.floor(d);
            if (closeTemple != null) {
                dist += Math.abs(closeTemple - d);
                closeShrine = shrines.floor(closeTemple);
                if (closeShrine != null) {
                    dist += Math.abs(closeShrine - closeTemple);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeShrine = shrines.ceiling(d);
            if (closeShrine != null) {
                dist += Math.abs(closeShrine - d);
                closeTemple = temples.floor(closeShrine);
                if (closeTemple != null) {
                    dist += Math.abs(closeTemple - closeShrine);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeTemple = temples.ceiling(d);
            if (closeTemple != null) {
                dist += Math.abs(closeTemple - d);
                closeShrine = shrines.floor(closeTemple);
                if (closeShrine != null) {
                    dist += Math.abs(closeShrine - closeTemple);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeShrine = shrines.floor(d);
            if (closeShrine != null) {
                dist += Math.abs(closeShrine - d);
                closeTemple = temples.ceiling(closeShrine);
                if (closeTemple != null) {
                    dist += Math.abs(closeTemple - closeShrine);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            dist = 0;
            closeTemple = temples.floor(d);
            if (closeTemple != null) {
                dist += Math.abs(closeTemple - d);
                closeShrine = shrines.ceiling(closeTemple);
                if (closeShrine != null) {
                    dist += Math.abs(closeShrine - closeTemple);
                    if (dist < min) {
                        min = dist;
                    }
                }
            }

            System.out.println(min);
        }
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
                catch (IOException  e)
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
