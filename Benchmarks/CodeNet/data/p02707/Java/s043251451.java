
/*atcoder 163 begin*/
import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n - 1;i++){
			arr[in.nextInt() - 1]++;
		}

		for(int i =0;i < n;i++){
			System.out.println(arr[i]);
		}
	}
}