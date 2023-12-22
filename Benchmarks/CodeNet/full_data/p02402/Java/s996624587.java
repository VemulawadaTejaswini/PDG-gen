import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		long sum = 0;
		long min = 1000000;
		long max = -1000000;
		long a = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i = 1;i <= n;i++){
			a = scan.nextInt();
			if(a < min){
				min = 	a;
			}
			if(a > max){
				max = a;
			}
			sum += a;
		}
		System.out.println(min + " " + max + " " + sum);
	}

}