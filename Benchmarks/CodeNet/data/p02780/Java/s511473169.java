import java.util.Scanner;

public class Main {
	static float max = 0;
	static float tmp = 0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] array = new int[n];
        for (int i = 0; i < n; i++) {
        	array[i] = sc.nextInt();
        }
        for (int i = 0; i < n+1-k; i++) {
            for (int j = 0; j < k; j++) {
            	float sum = sum(array[i+j]);
            tmp += sum/array[i+j];
        }
            max = Math.max(max, tmp);
            tmp =0;
        }
        System.out.println(max);
		}
	private static int sum(int n) {
		int sum = 0;
        for (int i = 0; i < n; i++) {
        	sum += n-i;
        }
		return sum;
	}
}