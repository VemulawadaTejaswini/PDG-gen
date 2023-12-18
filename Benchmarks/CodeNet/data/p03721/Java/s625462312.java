import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] list = new int[(int)Math.pow(10, 5)];
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a-1] += b;
		}
		
		int count = 0;
	
		for(int l: list) {
			k -= l;
			count += 1;
			
			if(k<=0) {
				System.out.println(count);
				break;
			}
			
			
		}
		
		sc.close();

	}

}
