import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		double d = sc.nextInt();

		double tturn = Math.ceil(c/b);
		double aturn = Math.ceil(a/d);

		System.out.println(tturn + "/" + aturn);

		if(tturn <= aturn) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
}