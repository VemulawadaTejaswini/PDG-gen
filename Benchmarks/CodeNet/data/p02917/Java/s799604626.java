import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] b = new int[n-1];
		    int ans =0;
		    for(int i=0;i<n-1;i++) {
		    	b[i] = sc.nextInt();
		    	ans += b[i];
		    	if(i==0) {
		    		ans += b[i];
		    	}
		    }
		    System.out.println(ans);

		    sc.close();
	}
}
