import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String ans = "Yes";
		if(A / D < C / B){
			ans = "No";
		}else if(A / D == C / B && A % D == 0 && C % B != 0){
			ans = "No";
		}
		System.out.println(ans);
	}
}