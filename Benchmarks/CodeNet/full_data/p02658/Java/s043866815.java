/*
 N個の整数が与えられます。それらの積を求めてください。
ただし、結果が10^18を超える場合は、代わりに -1 を出力してください。
与える順序は先にN、その後に積を算出する整数とします。
 */

import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		long n,b,ans;
		int i;
		Scanner sc = new Scanner(System.in);
			n= sc.nextLong();
			ans = sc.nextLong();
			for(i=2;i<=n;i++){
				if(ans!=-1){
					b = sc.nextLong();
					ans=ans*b;
					if(ans>1000000000000000000L){
						ans=-1;
					}
				}	
				else{
					b = sc.nextLong();
					if(b==0){
						ans=0;
					}
				}	
			}
		System.out.println(ans);
	}
}
