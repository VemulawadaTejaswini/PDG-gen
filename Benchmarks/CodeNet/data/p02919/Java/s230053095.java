import java.util.Scanner;

public class R {
	
	
	private final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] arg) {
		int N = sc.nextInt();
		int[] P = new int[N];
		for (int i = 0; i < P.length; i++) {
			P[i] = sc.nextInt();
		}
		int [][] array = new int[N-1][2];
		int sum =0;
		for(int i = 0; i < N-1; i ++) {
			if(P[i] < P[i+1]) {
				array[i][0] = P[i];
				array[i][1] = P[i+1];
				sum += P[i];
			} else {
				array[i][1] = P[i];
				array[i][0] = P[i+1];
				sum += P[i+1];
			}
		}
		for (int k = N-2; k > 0; k--) {
			for(int i = 0; i < k; i++ ) {
				if(array[i][0] < array[i+1][0]) {
					sum += array[i+1][0];
					array[i][0] = array[i+1][0]; 
					array[i][1] = array[i+1][1];
				} else if(array[i][0] > array[i+1][0]) {
					sum += array[i][0];
				} else {
					if(array[i][1] < array[i+1][1]) {
						sum += array[i][1];
						array[i][0] = array[i][1];
						array[i][1] = array[i+1][1];
					} else if(array[i][1] > array[i+1][1]){
						sum += array[i+1][1];
						array[i][0] = array[i+1][1];
						array[i][1] = array[i][1];
					} else {
						sum += array[i][0];
					}
				}
			}
			for(int i = 0; i < k; i++ ) {
				System.out.println("{ " + array[i][0] + " , " + array[i][1] + " }");
			}
		}
		System.out.println(sum);
	}
}
