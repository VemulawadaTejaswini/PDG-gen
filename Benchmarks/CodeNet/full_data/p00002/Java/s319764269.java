import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		for(int c = 0;c<200;c++){
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			int s = a + b;
			String S = String.valueOf(s);
			if(a == 0 && b == 0){
				System.out.println("0");
			}else{
				System.out.println(S.length());
			}
		}
	}
}