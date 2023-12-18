import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			H -= sc.nextLong();
		}
		if(H<=0) {System.out.println("Yes");}
		else {System.out.println("No");}
	}
}