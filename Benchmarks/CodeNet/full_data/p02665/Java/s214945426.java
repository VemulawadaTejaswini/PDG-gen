import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] in = new long [n+1];
        for(int i=0;i<=n;i++){
                             in[i] = sc.nextInt();
                             }
		long ans = 0;
        long max = 1;
        for(int i=0;i<=n;i++){if(in[i]>max){ans=-1;break;}
                              if(i<n){long ans2 = Math.max(max,in[i]+(in[i+1]+1)/2);
                                      ans+=ans2; 
                                      max=2*(ans2-in[i]);}
                              else{ans+=in[i];}                                                                                           
                             }        
		System.out.println(ans);
	}
}