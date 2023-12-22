import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		long sum = 0;

		for(int i = 0; i < n; i++){
          for(int ii = i + 1; ii < n; ii++){
            sum += arr[i] * arr[ii];
          }
		}
     	int mod = (int)Math.pow(10, 9) + 7;
		System.out.println(sum % mod);
	}
}