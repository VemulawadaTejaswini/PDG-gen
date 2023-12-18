import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main instance = new Main();
        sc = instance.new Scanner();
        instance.solve();
	}

	private void solve() {
        try {
        	int N = sc.nextInt();
        	int[] array = new int[N];
        	Integer nums = sc.nextInt();
        	for(int i=N; i>0; i++) {
        		array[i-1] = nums % 10;
        		nums = nums / 10;
        		//array[i] = Integer.parseInt(nums.substring(i,i+1));
        	}
        	//イテレーション
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N-i-1; j++) {
        			array[j] = abs(array[j], array[j+1]);
        			//array.set(j, abs(array.get(j), array.get(j+1)));
            	}
        	}
            System.out.println(array[0]);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private int abs(int a, int b) {
		if(a == 0) {
			return b;
		}else if(a == 1){
			switch(b) {
			case 0:
				return 1;
			case 1:
				return 0;
			case 2:
				return 1;
			case 3:
				return 2;
			}
		}else if(a == 2) {
			switch(b) {
			case 0:
				return 2;
			case 1:
				return 1;
			case 2:
				return 0;
			case 3:
				return 1;
			}
		}else if(a == 3) {
			switch(b) {
			case 0:
				return 3;
			case 1:
				return 2;
			case 2:
				return 1;
			case 3:
				return 0;
			}
		}
		return 0;
//        if(a>b) {
//        	return a-b;
//        }else {
//        	return b-a;
//        }
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
