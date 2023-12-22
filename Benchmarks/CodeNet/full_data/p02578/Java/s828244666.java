import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long tmp = 0;
		long forward = 0;
		long now = 0;
		long result = 0;
		for(int i=0;i < N;i++) {
			now = sc.nextLong();
			if(now < forward) {
				result = result + (forward - now);
			}
			forward = now;
		}

		System.out.println(result);

	}

}