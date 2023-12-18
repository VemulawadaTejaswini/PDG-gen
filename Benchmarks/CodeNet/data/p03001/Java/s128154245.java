import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();

        long w = scanner.nextLong();
        long h = scanner.nextLong();
        long x = scanner.nextLong();
        long y = scanner.nextLong();

        long tmpX = 0;
        long tmpY = 0;

        if((w-x)>x){
        	tmpX = x * h;
        }else {
        	tmpX = (w-x) * h;
        }

        if((h-y)>y) {
        	tmpY = y * w;
        }else{
        	tmpY = (h-y) * w;
        }

        if(w==x&h==y) {
        	tmpX = (w*h)/2;
        	tmpY = (w*h)/2;
        }

        long ans = Math.max(tmpX,tmpY);
        String answer = String.valueOf(ans);
        if(w==x&h==y) {
        	answer += " 0";
        }else{
        	if(tmpX==tmpY) {
        		answer += " 1";
        	}else {
        		answer += " 0";
        	}
        }

        System.out.println(answer);

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