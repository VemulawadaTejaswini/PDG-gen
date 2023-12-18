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

    private void solve() {
        try {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	int c = sc.nextInt();
        	int max = Math.max(a, Math.max(b, c));
        	int kaisuu = 0;

        	List<Integer> list = new ArrayList<>();
        	list.add(a);
        	list.add(b);
        	list.add(c);

        	//まず2あげるのを使って、最大値に近づける
        	int pos = 0;
        	for(Integer i : list) {
        		if(max == i) {
        			//同じなら次へ
        			pos ++;
        			continue;
        		}else {
        			//違う
        			kaisuu = kaisuu + (max - i) / 2;
        			if((max - i) % 2 != 0) {
        				list.set(pos, max - 1);
        			}else {
        				list.set(pos, max);
        			}
        			pos ++;
        		}
        	}

        	if((list.get(0)== list.get(1)) &&  (list.get(0)== list.get(2))) {
        		//すべての値が一致
        		System.out.println(kaisuu);
        		return;
        	}

        	pos = 0;
        	int notMaxEqlCount = 0;
        	for(Integer j : list) {
        		if(j != max) {
        			notMaxEqlCount++;
        		}
        	}

        	if(notMaxEqlCount == 1) {
        		System.out.println(kaisuu + 2);
        	}else {
        		System.out.println(kaisuu + 1);
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