import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);

		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int[] a = new int[n+1];
		    int[] b = new int[n+1];
		    a[0]=0;
		    b[0]=0;
		    for(int i=1;i<=n;i++) {
		    	a[i] = sc.nextInt();
		    	b[i] = sc.nextInt();
		    }

		    int[] s = new int[m+1];
		    s[0]=0;
		    for(int k=1; k<=m; k++) {
		    	int max_k = 0;
		    	int max_num = 0;
		    		for(int i=1;i<=n;i++) {
		    			if((a[i]<=k) && (max_k<b[i])) {
		    				max_k=b[i];
		    				max_num = i;
		    			}
		    		}
		    	if(max_k != 0) {
		    		b[max_num]=0;
		    	}
		    	s[k] = s[k-1]+max_k;
		    }
		    System.out.println(s[m]);

		    sc.close();
	}
}
