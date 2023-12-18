import java.util.Scanner;

public class Main {
//http://agc010.contest.atcoder.jp/tasks/agc010_a
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A > B){
			System.out.println("Alice");
		}
		else if(B > A){
			System.out.println("Bob");
		}
		else{
			System.out.println("Draw");
		}
	}
}