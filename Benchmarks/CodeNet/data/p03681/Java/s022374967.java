import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int div = (int)(Math.pow(10, 9)+7);
		
		sc.close();
		
		if(Math.abs(n-m)>1) {
			System.out.println(0);
		}else if(n==m){
			int count = 1;
			
			for(int i = n; i>0; i--) {
				count = (count*(i*i)) % div;
			}
			
			System.out.println((count*2)%div);
		}else {
			n = Math.min(n, m);
			int count = 1;
			
			for(int i=n; i>0; i--) {
				count = (count*(i+1)*i) % div;
			}
			
			System.out.println(count);
			
			
		}

	}

}