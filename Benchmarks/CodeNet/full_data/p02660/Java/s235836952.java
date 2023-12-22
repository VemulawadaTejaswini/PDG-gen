import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
        int p = 2;
        while(n>=2){for(int i=p;i<=Math.sqrt(n);i++){if(n%i==0){n/=i;p=i+1;ans++;break;}
                                                     else{if(i+1>Math.sqrt(n)){ans++;n=1;break;}}
                                         }
                   if(p>Math.sqrt(n)){if(n>p){ans++;}break;}}
		System.out.println(ans);
	}
}