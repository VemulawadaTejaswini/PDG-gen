import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			if(a % 2 == 1) {
				a = a - 1;
			}
			
			b = (a/2) + b;
			a = a/2;
			i++;
			if(i >= k) {
				break;
			}
			
			if(b % 2 == 1) {
				b = b - 1;
			}
			
			a = (b/2) + a;
			b = b/2;
		}
		System.out.println(a + " " + b);
	}

}