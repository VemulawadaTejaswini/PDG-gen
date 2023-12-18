import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		execute();
	}
 
	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
 
			int ans = (int)(a / 1.08);
			if (calc((int)ans)==a) {
				System.out.println((int)ans);
 			} else if(calc(ans-1)==a) {
 				System.out.println((int)ans-1);
 			} else if(calc(ans+1)==a) {
 				System.out.println((int)ans+1);
 			} else {
 				System.out.println(":(");
			}
 
		}
	}
	
	private static int calc(int arg) {
		return (int)(arg*1.08);
	}
}