import java.util.Scanner;

class Main{

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		int[] A = new int[N];
		int[] data = new int[100000];

		for(int i= 0;i < N;i++){
			A[i] = scan.nextInt();
		}
		int count = 0;
		for(int i= 0;i < N;i++){
			for(int j =i;j < N;j++){
				for(int e = i;e <= j;e++){
					data[count] += A[e];

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

		System.out.println(ans);
	}









}