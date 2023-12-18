import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		String A = sc.next(), B = sc.next(), C = sc.next();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			if(A.charAt(i) == B.charAt(i) && B.charAt(i) == C.charAt(i)) {
				continue;
			}else if(A.charAt(i) != B.charAt(i) && A.charAt(i) != C.charAt(i) && B.charAt(i) != C.charAt(i)) {
				ans += 2;
			}else {
				ans++;
			}
		}
		System.out.println(ans);
	}
}