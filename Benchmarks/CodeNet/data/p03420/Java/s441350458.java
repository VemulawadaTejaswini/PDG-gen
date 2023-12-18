import java.io.*;
import java.util.*;

class Main{

	public static void main(String[] args){
		solve();
	}
	
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long count = 0;

		if(n==0){
			count = n*n;
		}
		else{
			for(int i=2;i<=n;i++){
				for(int j=1;j<i;j++){
					if(i%j>=k){
						count++;
					}
				}
			}
			count += (n-k)*(n-k+1)/2;
		}

		System.out.println(count);
	}
}
