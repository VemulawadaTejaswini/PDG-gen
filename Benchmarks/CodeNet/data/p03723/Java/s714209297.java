
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
        	long A = sc.nextLong();
        	long B = sc.nextLong();
        	long C = sc.nextLong();
        	
        	if (A%2!=0||B%2!=0||C%2!=0) {
        		System.out.print("0");
        		return;
        	}
        	else if (A == B && B == C) {
        		System.out.print("-1");
        		return;
        	}
        	
        	swap(A,B,C);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void swap(long A, long B, long C){
    	long cnt = 0;
    	long mstA=A,mstB=B,mstC=C;
    	long tempA,tempB,tempC;
    	while (true) {
    		if (mstA%2!=0||mstB%2!=0||mstC%2!=0) break;
    		tempA=mstA/2;tempB=mstB/2;tempC=mstC/2;
    		mstA=tempB+tempC;
    		mstB=tempA+tempC;
    		mstC=tempA+tempB;
    		cnt++;
    	}
    	System.out.print(cnt);
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