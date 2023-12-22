import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        Pair [] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int l = 0; int r = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) =='(') {
                    r++;
                } else {
                    if (r == 0) l++;
                    else r--;
                }
            }
            p[i] = new Pair(l, r);
        }
        int front = 0; int back = 0;
        ArrayList<Pair> m = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (p[i].l == 0 && p[i].r == 0) continue;
            else if (p[i].l == 0) back += p[i].r;
            else if (p[i].r == 0) front += p[i].l;
            else m.add(p[i]);
        }
        Collections.sort(m);
        int sum = front - back;
        for (int i = 0; i < m.size(); i++) {
            sum += m.get(i).r; sum -= m.get(i).l;
        }
        if (sum != 0) {
            out.println("No");
        } else {
            boolean ok = true; int past = front;
            for (int i = 0; i < m.size(); i++) {
                if (m.get(i).l > past) ok = false;
                past += m.get(i).r;
            }
            past = back;
            for (int i = m.size() - 1; i >= 0; i--) {
                if (m.get(i).r > past) ok = false;
                past += m.get(i).l;
            }
            out.println(ok ? "Yes" : "No");
        }
        out.close();
    }

    static class Pair implements Comparable<Pair> {
        int l; int r;
        Pair(int l, int r) {
            this.l = l; this.r = r;
        }

        @Override
        public int compareTo(Pair o) {
            int d1 = r - l;
            int d2 = o.r - o.l;
            if (d1 >= 0 && d2 < 0) return -1;
            else if (d2 >= 0 && d1 < 0) return 1;
            else {
                if (d1 >= 0) {
                    return Integer.compare(l, o.l);
                } else {
                    return Integer.compare(o.r, r);
                }
            }
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