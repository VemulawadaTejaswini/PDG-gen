import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static Scanner sc;

    public static void main(String[] args) {
        Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
    }

    private void solve() {

        try {
        	int H,W;
        	H = sc.nextInt();
        	W = sc.nextInt();
        	String[][] arymap = new String[H][W];
        	String tmp;
        	char[] tmpary;

        	for (int i=0;i<H;i++) {
        		tmp = sc.next();
        		tmpary=tmp.toCharArray();
        		for (int j=0;j<W;j++) {
        			arymap[i][j] = String.valueOf(tmpary[j]);
        		}
        	}

        	int cnt=0;
        	while(!resultCheck(H,W,arymap)) {
        		arymap=takeStep(H,W,arymap);
        		//printState(H,W,arymap);
        		cnt++;
        	}
        	System.out.println(cnt);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void printState(int H, int W, String[][] ary) {
    	for (int i=0;i<H;i++) {
    		for (int j=0;j<W;j++) {
    			System.out.print(ary[i][j]);
    		}
    		System.out.println();
    	}
    }

    private String[][] deepCopy(int H, int W, String[][] ary) {
    	String[][] cp = new String[H][W];
    	for (int i=0;i<H;i++) {
    		for(int j=0;j<W;j++) {
    			cp[i][j] = ary[i][j];
    		}
    	}
    	return cp;
    }

    private String[][] takeStep(int H, int W, String[][] ary){
    	String[][] tmp =deepCopy(H,W,ary);
    	for(int i=0;i<H;i++) {
    		for(int j=0;j<H;j++) {
    			if (ary[i][j].equals("#")) {
    				//左
    				if(j>0) {
    					tmp[i][j-1] = "#";
    				}
    				//上
    				if(i>0) {
    					tmp[i-1][j] = "#";
    				}
    				//右
    				if(j<W-1) {
    					tmp[i][j+1] = "#";
    				}
    				//下
    				if(i<H-1) {
    					tmp[i+1][j] = "#";
    				}
    			}
    			//System.out.println("-----");
    			//System.out.println("i:"+i+ " j:"+j);
    			//printState(H,W,tmp);
    		}
    	}
    	return tmp;
    }

    private boolean resultCheck(int H, int W, String[][] ary) {
    	for (int i=0;i<H;i++) {
    		for (int j=0;j<W;j++) {
    			if(ary[i][j].equals(".")) return false;
    		}
    	}
    	return true;
    }

    private class Scanner {
        String[] s;
        int i;
        BufferedReader br;
        String regex = " ";

        public Scanner() {
            s = new String[0];
            i = 0;
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                super.finalize();
            } finally {
                destruction();
            }
        }

        private void destruction() throws IOException {
            if (br != null) br.close();
        }

        public String next() throws IOException {
            if (i < s.length) return s[i++];
            String st = br.readLine();
            while (st == "") st = br.readLine();
            s = st.split(regex, 0);
            i = 0;
            return s[i++];
        }

        public int nextInt() throws NumberFormatException, IOException {
            return Integer.parseInt(next());
        }

        public Long nextLong() throws NumberFormatException, IOException {
            return Long.parseLong(next());
        }

        public Double nextDouble() throws NumberFormatException, IOException {
            return Double.parseDouble(next());
        }
    }
}