import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int pw = 1;
		for(int i=1;i<=N;i++) {
			pw = pw * i;
		}
		System.out.println(pw % (Math.pow(10,9)*7));
	}

}