import java.util.Scanner;

public class Main{
	public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int n=sc.nextInt();
    		int[] a=new int[100010];
    		int[] dp=new int[100010];
    		for(int i=0; i<n; i++) {
    			a[i]=sc.nextInt();
    		}
    		//dp[長さ]＝数字
    		int m=1;
    		int jj=0;
    		dp[1]=a[0];
    		for(int j=jj+1; j<n; j++) {
    			if(a[j]<dp[m]) {
    				dp[m]=a[j];
    				dp[m+1]=a[j+1];
    				jj=j+1;
    				m++;
    			}
    		}
    		System.out.println(m);
    	}
    }
}
