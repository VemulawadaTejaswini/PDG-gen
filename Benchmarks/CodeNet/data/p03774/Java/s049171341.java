import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long[]stuX = new long[n];
		long[]stuY = new long[n];
		long[]pntX = new long[m];
		long[]pntY = new long[m];
		for(int i=0;i<n;i++) {
			stuX[i]=scan.nextLong();
			stuY[i] = scan.nextLong();
		}
		for(int i=0;i<m;i++) {
			pntX[i]=scan.nextLong();
			pntY[i] = scan.nextLong();
		}
		long[][] zettai = new long[n][m];

		long[] saitanP = new long[n];
		for(int i=0;i<n;i++) {
			long saitanL = (long)Math.pow(10, 8);
			for(int l=0;l<m;l++) {
				zettai[i][l]=Math.abs(stuX[i]-pntX[l])+Math.abs(stuY[i]-pntY[l]);
				//System.out.println("zettai"+zettai[i][l]);
//i番目の学生のポイント0～ｌに対する距離
					if(saitanL>zettai[i][l]) {
						saitanL = zettai[i][l];
						saitanP[i]=l+1;
						//System.out.println(saitanP[i]);

					}

				}
			}
		for(int i=0;i<n;i++) {
			System.out.println(saitanP[i]);
		}


		}



	}


