import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n;

	private char[][] Num = {
			{'1','i','j','k'},
			{'i','-','k','J'},
			{'j','K','-','i'},
			{'k','j','I','-'}
		};

	public void mainrun() {
		scan = new Scanner(System.in);

		while(true) {
			n = Integer.parseInt(scan.nextLine());

			if(n == 0) {
				break;
			}

			while(n-- != 0) {
				int[] dataA = new int[4];
				int[] dataB = new int[4];
				int num,i,j,k;

				num = i = j = k = 0;

				int A = 0;
				for(String d : scan.nextLine().split(" ")) {
					if(A < 4) {
						dataA[A++] = Integer.parseInt(d);
					}else {
						dataB[(A++) - 4] = Integer.parseInt(d);
					}
				}


				for(int a = 0 ; a < 4 ; a++) {
					for(int b = 0 ; b < 4 ; b++) {
						int add = dataA[a] * dataB[b] * (Character.isUpperCase(Num[a][b]) ? -1 : 1 );

						switch(Character.toLowerCase(Num[a][b])) {
						case '1':
						case '-':
							num += add * (Num[a][b] == '-' ? -1 : 1);
							break;
						case 'i':
							i += add;
							break;
						case 'j':
							j += add;
							break;
						case 'k':
							k += add;
							break;
						default:
							break;
						}
					}
				}

				System.out.println(num + " " + i + " " + j + " " + k);
			}
		}



		scan.close();
	}
}
