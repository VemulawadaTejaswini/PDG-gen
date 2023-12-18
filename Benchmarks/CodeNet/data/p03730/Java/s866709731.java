import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int flg = 0;
		if(A == 1) flg = 1;
		for(int i = B;i <= B * 2 ;i ++) {
			if(C == A * i % B) flg = 1;
		}
		if(flg == 1) System.out.println("YES");
		else System.out.println("NO");
	}
}