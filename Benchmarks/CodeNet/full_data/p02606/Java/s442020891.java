import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int R = sc.nextInt();
		int d = sc.nextInt();

		int ans = 0;
		for(int i=N;i<R+1;i++){
			if(i%d==0){ans++;}
		}

		System.out.println(ans);
	}
}