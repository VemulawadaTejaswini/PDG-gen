import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	int N = in.nextInt();
	boolean num[] = new boolean[1000000001];

	int sum = 0;

	for(int cnt = 0; cnt < N; cnt++){
		int A = in.nextInt();
		if(num[A] == false){
			num[A] = true;
			sum = sum + 1;
		}
		else{
			num[A] = false;
			sum = sum - 1;
		}
	}
	System.out.println(sum);
}
}