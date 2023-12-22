import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	private static FastScanner sc = new FastScanner();
	private static char[] op = {'N', 'W', 'W', 'W', 'N', 'N'};

	public static void main(String[] args) {

		int n = sc.nextInt();

		int[] num = new int[6];
		Dice[] dice = new Dice[n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<num.length; j++) {
				num[j] = sc.nextInt();
			}

			dice[i] = new Dice(num);
		}

		for(int l=0; l<n-1; l++){
			for(int m=l+1; m<n; m++){
				if(l != m){
					for(int i=0; i<op.length; i++) {
						for(int j=1; j<=4; j++) {

							boolean flag = true;
							for(int k=0; k<num.length; k++) {
								if(dice[l].getNum(k) != dice[m].getNum(k)) {
									flag = false;
									break;
								}
							}

							if(flag) {
								System.out.println("No");
								return;
							}

							dice[m].spin();
						}

						dice[m].lotate(op[i]);
					}
				}
			}
		}



		System.out.println("Yes");

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


}