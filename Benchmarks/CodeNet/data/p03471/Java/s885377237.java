import java.util.Scanner;


public class Main{
    public  static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
    		int N=sc.nextInt();
    		int Y=sc.nextInt();
    		int[] dp= new int[20000001];
    		int[] a= new int[20000001];
    		int[] b= new int[20000001];
    		int[] c= new int[20000001];
    		for(int i=0; i<=N; i++) {
    			for(int j=0; j<=N-i; j++) {
    				a[i*10000+j*5000+(N-i-j)*1000]=i;
    				b[i*10000+j*5000+(N-i-j)*1000]=j;
    				c[i*10000+j*5000+(N-i-j)*1000]=N-i-j;
    				dp[i*10000+j*5000+(N-i-j)*1000]++;
    			}
    		}
    		if(dp[Y]!=0) {
    			System.out.println(a[Y]+" "+b[Y]+" "+c[Y]);
    		}
    		else {
    			System.out.println(-1+" "+-1+" "+-1);
    		}
    	}
    }
}