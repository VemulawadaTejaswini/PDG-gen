import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] in = new long [n];
        long [] ans = new long [n+1];
        for(int i=0;i<n;i++){
                             in[i] = sc.nextLong();
                            }
        ans [0] = 0;
        ans [1] = 2*in[0];
        for(int i=0;i<n-1;i++){ans[i+2] = ans[i]+2*(in[i+1]-in[i]);
                              }
        long a = ans[n]/2;
        for(int i=0;i<n;i++){if(i%2==0){System.out.println(ans[i]+a);}
                             else{System.out.println(ans[i]-a);}
                            }		
	}
}
