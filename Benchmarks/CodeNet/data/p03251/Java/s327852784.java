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
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int x_max = x;
        int y_min = y;

        int tmp = 0;
        for (int i=0;i<n;i++) {
        	tmp = scanner.nextInt();
        	if(tmp>x_max) {
        		x_max = tmp;
        	}
        }
        for (int j=0;j<m;j++) {
        	tmp = scanner.nextInt();
        	if(tmp<y_min) {
        		y_min = tmp;
        	}
        }

        if(x_max>=y_min){
        	System.out.println("War");
        }else if((x_max == x)&&(y_min==y)) {
        	System.out.println("War");
        }else {
        	System.out.println("No War");
        }


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