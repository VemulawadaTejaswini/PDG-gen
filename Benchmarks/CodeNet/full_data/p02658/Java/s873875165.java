import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextLong();
                            }
        Arrays.sort(in);
		long ans = in[0];
        long b = 1000000*1000000*1000000;
        for(int i=1;i<a;i++){if(in[i]==0){ans=0;break;}
                             if(ans*in[i]<=b){ans=ans*in[i];
                                             }else{ans=-1;break;}
                            }
		System.out.println(ans);
	}
}
