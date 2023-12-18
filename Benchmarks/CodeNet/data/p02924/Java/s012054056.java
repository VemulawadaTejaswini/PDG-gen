import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i < n; i++) {
			sum  += i;
			}
		
		int index = 1;
		int max = 1;
		
		for (int i = n-1; i >= 1; i--) {
			if (n%(i+1) > i) {
				index = i;
				max = n%(i+1);
			}
		}
		
		sum -= index;
		sum += max;
		System.out.println(sum);
				
	}

}
