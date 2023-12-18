import java.util.Scanner;

public class Main {
	static boolean win(int A , int B , int C , int D){
		if(B >= C){
			return true;
		}
		return !win(C - B , D , A , B);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if(win(A, B , C, D)){
			System.out.println("Yes");
		}else{
			System.out.println("No");			
		}
	}
}
