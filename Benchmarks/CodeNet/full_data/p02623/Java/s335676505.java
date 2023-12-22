import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
        long k = sc.nextLong();
		long [] in = new long [n+1];
        long [] in2 = new long [m+1];
       
        for(int i=1;i<n+1;i++){                               
                               in[i]=in[i-1]+sc.nextLong();
                              }
        for(int i=1;i<m+1;i++){                            
                               in2[i]=in2[i-1]+sc.nextLong();
                              }
        int ans = 0;
        for(int i=0;i<=n;i++){if(in[i]>k){break;}
        int small = 0;
        int big = m+1;
        int point = (small+big)/2;
        int size = point-small;               
        while(big-small>1){size = Math.max(size/2,1);
                         if(k-in[i]>in2[point]){small=point;point+=size;}
                         else{big=point;point-=size;}                
                        }
        ans=Math.max(ans,i+point);
        }                                                                  
		System.out.println(ans);
	}
}