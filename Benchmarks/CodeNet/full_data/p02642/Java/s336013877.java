import java.util.*;
public class Main {
    public static long gcd(long x,long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static long lcm(long x,long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        int ans = 0;
        int count = 0;
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
		Arrays.sort(in);        
        for(int i=0;i<a;i++){count = 0;for(int j=0;j<a;j++){if(in[i]%in[j]==0){count++;}
                                                           }if(count==1){ans++;}
                            }       
		System.out.println(ans);
	}
}