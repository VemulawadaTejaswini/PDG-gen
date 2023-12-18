import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();

		int X=Integer.parseInt(a+b);

		if(X==4||X==9||X==16||X==25||X==36||X==49||X==64||X==81||X==100){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}


	}
}