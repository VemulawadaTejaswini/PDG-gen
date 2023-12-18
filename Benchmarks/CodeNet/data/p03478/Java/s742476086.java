import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N =Integer.parseInt(in.next());
		int A =Integer.parseInt(in.next());
		int B =Integer.parseInt(in.next());
		int ans = 0;
		int temp = 1;
		for(int i = 1; i <= N; i++){
			temp = w(i);
			if((A <= temp) && (temp <= B)) ans += i;
		}
		System.out.println(ans);
	}
	static int w(int n){
		if(n == 10000)return 1;
		else return (int)(Math.floor(n/1000)+Math.floor((n%1000)/100)+Math.floor(((n%1000)%100)/10)+Math.floor((((n%1000)%100)%10)));
	}
}