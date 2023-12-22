import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			
			int p = 32;
			for(int i=0;;i++){
				p -= (p-1)%5;
				if(p<=0) break;
				System.out.println(p);
				p -= a[i%n];
				if(p<=0) break;
				System.out.println(p);
			}
			System.out.println(0);
		}	
	}	
}