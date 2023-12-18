
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int s = scanner.nextInt();
        int roop = 1000000;
        Integer[] li = new Integer[roop];
        li[0] = 0;

        for(int i=1;i<roop;i++) {
        	if(i == 1) {
        		li[i] = s;
        	}else {
        		int n = li[i-1];
        		if(n % 2 == 0) {
        			li[i] = n/2;
        		}else {
        			li[i] = 3*n+1;
        		}
        	}
        }

        int rs = 0;
        for(int i=1;i<roop-1;i++) {
        	for(int k=i+1;k<roop;k++) {
        		if(li[i] ==li[k]) {
        			rs = k;
        			System.out.println(rs);
        			break;
            	}
        	}
    		if(rs > 0) {
    			break;
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


