import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
        int k = sc.nextInt();
        int count = 0;
        int ans = 0;
		int [] in = new int [100000];
        int a,b;      
        for(int i=0;i<n;i++){a = sc.nextInt();
                             b = sc.nextInt();
                             in[a-1]+=b;                           
                            }       		
        for(int i=0;i<a;i++){count+=in[i];
                             if(count>=k){ans=i;break;}
                            }                                                      
		System.out.println(ans);
	}
}
