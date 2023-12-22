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
		long ans = 1;
       
        for(int i=0;i<a;;i++){if(ans*in[i]<=1000000000000000000){ans*=in[i];
                                                 }else{ans=-1;break;}
                            }     
		System.out.println(ans);
	}
}
