import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        String s = scanner.next();
        String t = scanner.next();
        if (s.equals(t)) {
        	System.out.println("Yes");
        }else {
        	boolean tmp = false;
        	for(int i = 0;i<s.length();i++) {
        		if(t.equals(s.substring(s.length()-1, s.length())+s.substring(0,s.length()-1))) {
        			System.out.println("Yes");
        			tmp = true;
        			break;
        		}
        		s = s.substring(s.length()-1, s.length())+s.substring(0,s.length()-1);
        	}
        	if (tmp == false) {
        		System.out.println("No");
        	}
        }



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