import java.util.Scanner;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0;i < n;i++){
			A[i] = sc.nextInt();
		}

		int[] sum = new int[n+1];
		for(int i = 0;i < n;i++){
			sum[i+1] =sum[i]+ A[i];
		}

		int[][] two = new int[21][n];
		for(int i = 0;i <= 20;i++){
			for(int j = 0;j < n;j++){
				if(A[j] == 0){
					continue;
				}else{

					if(A[j] % 2 == 0){
						A[j] /= 2;
						two[i][j] = 0;
					}else{
						A[j] /= 2;
						two[i][j] = 1;

					}
				}
			}
		}

		//		for(int i = 0;i <= 20;i++){
		//			for(int j = 0;j < n;j++){
		//				System.out.print(two[i][j]);
		//			}
		//			System.out.println();
		//		}

		int[][] tworuiseki = new int[21][n+1];
		for(int i = 0;i <= 20;i++){
			for(int j = 0;j < n;j++){
				tworuiseki[i][j+1] = tworuiseki[i][j] + two[i][j];
			}
		}

//		for(int i = 0;i <= 20;i++){
//			for(int j = 1;j <= n;j++){
//				System.out.print(tworuiseki[i][j]);
//			}
//			System.out.println();
//		}

		int ans = 0;
		for(int i = 0;i < n;i++){
			for(int j = i;j < n;j++){
				int sumtwo = 0;
				for(int x = 0;x <= 20;x++){
					if((tworuiseki[x][j+1] - tworuiseki[x][i]) % 2 == 1){
						sumtwo += (int)Math.pow(2, x);
					}
				}
//				System.out.println("i "+i+" j "+j+" sumtwo "+sumtwo+" sum "+(sum[j+1]-sum[i]));
				if(sum[j+1] - sum[i] == sumtwo){
					ans++;
//					System.out.println(sumtwo + " ok");
				}
			}				

		}
		System.out.println(ans);



	}

}



class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

