import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        int now=0;
        int before=0;
        int tmp_cnt = 0;
        int max = 0;
        boolean continue_flg = false;

        for(int i=0;i<n;i++) {
        	now = scanner.nextInt();

        	if(i!=0) {
        		if(now<=before) {
        			if(continue_flg) {
        				tmp_cnt++;
        				if(tmp_cnt>max) {
        					max = tmp_cnt;
        				}
        			}
        			continue_flg = true;
        		}else {
        			continue_flg = false;
        			tmp_cnt = 0;
        		}
        	}
        	before = now;
        }
        System.out.println(max);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private class MyScanner {
        String[] s;
        int i;
        BufferedReader br;
        String reg = " ";
        MyScanner () {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        public String next() {
            try {
                if (i < s.length) return s[i++];
                String line = br.readLine();
                while (line.equals("")) {line = br.readLine();}
                s = line.split(reg, 0);
                i = 0;return s[i++];
            } catch (Exception e) {e.printStackTrace();}
            return null;
        }
        public int nextInt() {
            try {return Integer.parseInt(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public double nextDouble() {
            try {return Double.parseDouble(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
        public long nextLong()  {
            try {return Long.parseLong(next());} catch (Exception e) {e.printStackTrace();}
            return -1;
        }
    }
}
