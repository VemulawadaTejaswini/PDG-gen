import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve(args);
    }

    public void solve(String[] args) {
        MyScanner scanner = new MyScanner();
        int a = scanner.nextInt(); // 500
        int b = scanner.nextInt(); // 100
        int c = scanner.nextInt(); //  50
        int x = scanner.nextInt(); // target
        int tmp500;
        int tmp100;
        int tmp50;
        int cnt = 0;

        for (int i=0;i<=a;i++) {
        	if(x<(500*i)) {
        		break;
        	}else if(x==(500*i)){
        		cnt++;
        		break;
        	}else{
        		tmp500 = x - (500*i);
        		for (int j=0;j<=b;j++) {
        			tmp100 = tmp500;
        			if(tmp100<(100*j)) {
        				break;
        			}else {
        				tmp50 = tmp100 - (100*j);
        				for(int k=0;k<=c;k++) {
        					if((tmp50-(50*k))==0) {
        						cnt++;
        					}
        				}
        			}
        		}
        	}

        }
        System.out.println(cnt);

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