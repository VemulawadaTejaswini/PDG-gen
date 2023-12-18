import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		int index = 0;
		int max = 0;
		
		for (int i = n-1; i >= 1; i--) {
			sum += i;
			if (n%(i+1) > i && n%(i+1) > max) {
				index = i;
				max = n%(i+1);
			}
		}
		
		sum -= index;
		sum += max;
		System.out.println(sum);
				
	}

}
