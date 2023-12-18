import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    /**<h1>最大公約数を求める(Greatest Common Divisor)[ユークリッドの互除法]</h1>
     * @param a ： 数値１(>0)
     * @param b ： 数値２(>0)
     * @return<b>int</b> ： 最大公約数 (なし=1 [互いに素])
     */
    public static final int gcd(int a, int b) {
        //a > b にする（スワップ）
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        //ユークリッドの互除法
        int r = -1;
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }

        return a;    //b には r=0 の値が入るため、a を返す
    }

    /**<h1>最小公倍数を求める(Least Common Multiple)</h1>
     * @param a ： 数値１(>0)
     * @param b ： 数値２(>0)
     * @return<b>int</b> ： 最小公倍数
     */
    public static final int lcm(final int a, final int b) {
        return a * b / gcd(a, b);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int n = scanner.nextInt();
        int[] all = new int[n];
        int lcm = 0;
        for (int i = 0;i<n;i++) {
        	all[i] = scanner.nextInt();
        	if (i==0) {
        		lcm = all[i];
        	}else {
        		lcm = lcm(lcm,all[i]);
        	}
        }
        lcm = lcm--;
        int tmp = 0;
        for (int j = 0;j<n;j++) {
        	tmp += lcm%all[j];
        }
        System.out.println(tmp);
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