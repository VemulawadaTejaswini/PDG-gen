import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int h[]=new int [n];
	      for(int i=0;i<n;i++){
			h[i] = sc.nextInt();
	      }
	      int x=0;
	      Arrays.sort(h);
	      for(int i=0;i<(n-k);i++) {
	    	  x+=h[i];
	      }

		  		System.out.print(x+k);

	}
}