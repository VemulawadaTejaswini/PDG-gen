import java.util.Scanner;

//public class atcoder0221_B{
public class Main{

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int A = scan.nextInt();
		int B = scan.nextInt();
		int count = 0;

		count = A*N/(A+B);
		if(N%(A+B)>=A) {
			count = count + A;
		}else {
			count = count + N%(A+B);
		}
		System.out.println(count);
	}
}