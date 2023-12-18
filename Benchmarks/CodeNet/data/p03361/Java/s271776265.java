import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int h = scanner.nextInt(); //行数
        int w = scanner.nextInt(); //列数

        String[][] picture = new String[h][w];
        for (int i=0;i<h;i++) {
        	picture[i] = scanner.next().split("");
        }

        boolean flg = true;
        for (int i =0;i<h;i++) {
        	if (flg == false) {
        		break;
        	}
        	for (int j=0;j<w;j++) {
        		if (picture[i][j].equals("#")) {
        			if (i!=0) {
        				if(picture[i-1][j].equals("#")) {
        					continue;
        				}
        			}
        			if (i!=(h-1)) {
        				if(picture[i+1][j].equals("#")) {
        					continue;
        				}
        			}
        			if (j!=0) {
        				if(picture[i][j-1].equals("#")) {
        					continue;
        				}
        			}
        			if (j!=(w-1)) {
        				if(picture[i][j+1].equals("#")) {
        					continue;
        				}
        			}
        			System.out.println("No");
        			flg = false;
        			break;
        		}
        	}
        }
        if (flg==true) {
        	System.out.println("Yes");
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
