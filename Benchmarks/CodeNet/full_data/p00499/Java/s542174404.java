import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		double lagu = (double)a / c;
		double math = (double)b / d;
		int ans_lagu = (int)Math.ceil(lagu);
		int ans_math = (int)Math.ceil(math);
		if(lagu > math){
			System.out.println(l - ans_lagu);
		}else{
			System.out.println(l - ans_math);
		}
	}
}