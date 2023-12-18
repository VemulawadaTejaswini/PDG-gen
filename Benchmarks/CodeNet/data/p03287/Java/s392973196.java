import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] A = new int[N];
		long[] data = new long[100000];

		for(int i= 0;i < N;i++){
			A[i] = scan.nextInt();
		}
		int count = 0;
		
		for(int j= 0;j < N;j++){
			for(int i= j;i < N;i++){
				if(i == j){
					data[count] = A[j];
				}else{
				data[count] += data[count-1]+ A[i];
				
				}
				count++;

			}
		}

		int ans = 0;
		for(int i = 0;i< count;i++){
			if(data[i] % M == 0){
				ans++;
			}
		}
		
//		for(int i = 0;i< count;i++){
//			System.out.println(data[i]);
//		}
//		System.out.println();

		System.out.println(ans);
	}









}