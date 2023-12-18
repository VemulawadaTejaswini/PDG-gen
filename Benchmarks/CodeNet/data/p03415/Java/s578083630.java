import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] A = new String[3];
		for(int i = 0; i < 3; i++){
			A[i] = sc.next();
		}
		System.out.println(ans(A));
	}
	public static String ans(String[] A){
		return String.valueOf(A[0].charAt(0)) + String.valueOf(A[1].charAt(1)) + String.valueOf(A[2].charAt(2));
	}
}
