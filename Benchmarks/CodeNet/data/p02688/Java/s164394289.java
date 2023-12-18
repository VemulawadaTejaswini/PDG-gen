import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] res = new int[n];
		int result = 0;
		for(int i = 0; i < k; i++){
			int d = scan.nextInt();
			for(int j = 0; j < d; j++){
				int a = scan.nextInt();
				res[a-1]++;
			}
		}
		for(int i = 0; i < k; i++){
			if(res[i] == 0)result++;
		}
		System.out.println(result);
	}
}
