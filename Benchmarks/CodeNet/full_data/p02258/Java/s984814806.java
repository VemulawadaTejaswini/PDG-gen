import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] R = new int[n];
		for (int i = 0; i < n; i++) {
			R[i] = scanner.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(R[j]-R[i]>max){
					max = R[j]-R[i];
				}
			}
		}
		System.out.println(max);
	}
}