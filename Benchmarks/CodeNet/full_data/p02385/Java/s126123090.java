import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static FastScanner sc = new FastScanner();
	private static char[] op = {'N', 'W', 'W', 'W', 'N', 'N'};

	public static void main(String[] args) {

		int[] num = new int[6];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		Dice dice1 = new Dice(num);

		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}

		Dice dice2 = new Dice(num);

		for(int i=0; i<op.length; i++) {
			for(int j=1; j<=4; j++) {

				boolean flag = true;
				for(int k=0; k<num.length; k++) {
					if(dice1.getNum(k) != dice2.getNum(k)) {
						flag = false;
						break;
					}
				}

				if(flag) {
					System.out.println("Yes");
					return;
				}

				dice2.spin();
			}

			dice2.lotate(op[i]);
		}

		System.out.println("No");

	}

	static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	static class Dice {

		//0:?????¢???1:S??´??¢???2:E??´??¢???3:W??´??¢???4:N??´??¢???5:?????¢
		int[] num = new int[6];

		Dice(int[] num) {
			for(int i=0; i<num.length; i++){
				this.num[i] = num[i];
			}
		}

		int getNum(int idx){
			return num[idx];
		}

		void lotate(char direction) {
			int temp;
			switch(direction) {
			case 'N':
				temp = num[0];
				num[0] = num[1];
				num[1] = num[5];
				num[5] = num[4];
				num[4] = temp;
				break;

			case 'S':
				temp = num[0];
				num[0] = num[4];
				num[4] = num[5];
				num[5] = num[1];
				num[1] = temp;
				break;

			case 'W':
				temp = num[0];
				num[0] = num[2];
				num[2] = num[5];
				num[5] = num[3];
				num[3] = temp;
				break;

			case 'E':
				temp = num[0];
				num[0] = num[3];
				num[3] = num[5];
				num[5] = num[2];
				num[2] = temp;
				break;
			}
		}

		//????¨????????????????
		void spin() {
			int temp = num[1];
			num[1] = num[2];
			num[2] = num[4];
			num[4] = num[3];
			num[3] = temp;
		}

	}

}