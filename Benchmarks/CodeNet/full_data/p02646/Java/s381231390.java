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
		String ans;
		if(A>B){
			if((A-T*V)<(B-T*W)){
				ans = "YES";
			}else{
				ans = "NO";
			}
		}else{
			if((A+T*V)>(B+T*W)){
				ans = "YES";
			}else{
				ans = "NO";
			}
		}
		System.out.println(ans);
	}
}
