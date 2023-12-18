import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();	
		long s = sc.nextLong();
		sc.close();
		long ans = -1;
		if(n==s){
			ans = 1;
		}
		else{
			for(long b=2;b<=n;b++){
				long tmpN = n;
				long sum = 0;
				// nをbで割る 余り -> sumに加算
				// 割った解が0なら  おわり
				do{
					sum += tmpN%b;
					tmpN = tmpN/b;
				}while(tmpN!=0);
				
				if (sum == s){
					ans = b;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}