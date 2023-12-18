import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Scanner sc;
    public static void main(String[] args) {
    	Main instance = new Main();
    	sc = instance.new Scanner();
    	instance.solve();
    }
    int N;
    int M;

    private void solve() {
    	try {
    		N = sc.nextInt();
    		M = sc.nextInt();
    		List<List<Integer>> list = new ArrayList<>();
    		String[] sa = new String[M];
    		for (int i = 0; i < M; i++) {
    			List<Integer> tmp = new ArrayList<>();
    			tmp.add(sc.nextInt());
    			tmp.add(sc.nextInt());
    			tmp.add(i);
    			list.add(tmp);
    		}
    		list.sort((a,b) -> {
    			if (b.get(0) > a.get(0)) {
                    return -1;
                }
                else if (b.get(0) < a.get(0)) {
                    return 1;
                }
                else {
                    if (b.get(1) > a.get(1)){
                        return -1;
                    } else {
                        return 1;
                    }
                }
    		});
    		int temp = 0;
    		int count = 1;
    		for (int i = 0; i < M; i++) {
    			int zero = list.get(i).get(0);
    			if (temp != zero) {
    				temp = zero;
    				count = 1;
    			}
    			sa[list.get(i).get(2)] = String.format("%06d%06d", zero, count);
    			count++;
    		}
    		for (int i = 0; i < M; i++) {
    			System.out.println(sa[i]);
    		}
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
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
fjadlfjalf
