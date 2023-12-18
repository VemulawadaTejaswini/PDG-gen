import java.util.Scanner;

enum Color{
	pink,red
}
public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Integer a=scanner.nextInt();
		String str=scanner.next();
		if(a<=3200) {
			System.out.println(Color.red);
		}else {
			System.out.println(str);
		}
		
	}
}