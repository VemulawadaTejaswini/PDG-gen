import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int q = sc.nextInt();
        ArrayList<Event> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            long start = sc.nextInt(); long end = sc.nextInt();
            long place = sc.nextInt();
            a.add(new Event(start - place, place, true));
            a.add(new Event(end - place, place, false));
        }
        for (int i = 0; i < q; i++) {
            long d = sc.nextInt();
            a.add(new Event(d));
        }
        Collections.sort(a);
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < a.size(); i++) {
            Event e = a.get(i);
            if (e.query) {
                if (set.isEmpty()) {
                    out.println(-1);
                } else {
                    out.println(set.first());
                }
            } else {
                if (e.start) {
                    set.add(e.place);
                } else {
                    set.remove(e.place);
                }
            }
        }
        out.close();
    }

    static class Event implements Comparable<Event> {
        long time; long place;
        boolean query; boolean start;
        Event(long time) {
            this.query = true;
            this.time = time;
        }
        Event(long time, long place, boolean start) {
            this.time = time; this.place = place;
            this.query = false;
            this.start = start;
        }

        @Override
        public int compareTo(Event o) {
            if (time == o.time) {
                if (query) return 1;
                else if (o.query) return -1;
                else if (place != o.place) return Long.compare(place, o.place);
                else if (start) return 1;
                else return -1;
            }
            return Long.compare(time, o.time);
        }
    }


    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}