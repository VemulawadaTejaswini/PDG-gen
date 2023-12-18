import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		int min = 0;
		int min_value = Integer.MAX_VALUE;
		for (int i = 0 ; i < n; i++) {
			int tmp = sc.nextInt();
			if (tmp < min_value) {
				min_value = tmp;
				min = i + 1;
			}
		}
		System.out.println(min);
	}
	
}