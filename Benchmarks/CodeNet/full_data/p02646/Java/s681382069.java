import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		String ans = "NO";
		A += Math.pow(10, 9);
		B += Math.pow(10, 9);
		if(A>B){
			if((A-B)>(T*(V-W))){
				ans = "YES";
			}
		}else if(A<B){
			if((B - A)<( T*(V-W))){
				ans = "YES";
			}
		}
		System.out.println(ans);
	}
}
