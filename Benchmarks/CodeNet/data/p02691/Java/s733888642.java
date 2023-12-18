import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] in = new long [n];       
		long ans = 0;
        for(int i=0;i<n;i++){in[i] = sc.nextLong();
                            }
        for(int i=0;i<n-1;;i++){for(int j=i+1;j<a;j++){if(in[i]+in[j]==j-i){ans++;}
                                                     }
                              }
		System.out.println(ans);
	}
}
