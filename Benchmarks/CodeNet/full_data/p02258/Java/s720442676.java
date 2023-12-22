import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int maxLong = 0;
		for(int i = 0; i < N; i++){
			a[i] = scan.nextInt();
		}
		for(int i = 0; i < N - 1; i++){
			for(int j = i + 1; j < N; j++){
				if(maxLong < a[j] - a[i]){
					maxLong = a[j] - a[i];
				}
			}
		}
		System.out.println(maxLong);
	}
}