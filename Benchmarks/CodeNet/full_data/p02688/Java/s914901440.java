import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] arr = new boolean[n + 1];
		for(int i = 0; i < k; i++) {
			int count = sc.nextInt();
			for(int j = 0; j < count; j++) {
				arr[sc.nextInt()] = true;
			}
		}
		int res = 0;
		for(int i = 1; i <= n; i++) {
			if(!arr[i])
				res++;
		}
		System.out.println(res);
    }
}