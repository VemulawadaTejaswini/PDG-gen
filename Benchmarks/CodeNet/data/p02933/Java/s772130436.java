import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Integer a=scanner.nextInt();
		String str=scanner.next();
		if(a<3200) {
			System.out.println("red");
		}else {
			System.out.println(str);
		}
		
	}
}
