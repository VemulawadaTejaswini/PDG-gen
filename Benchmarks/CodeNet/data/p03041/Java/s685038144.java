import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y=sc.nextInt();
		String s=sc.next();

		String b = s.substring(y-1,x);
		String as=s.substring(0,y-1);
		String c = b.substring(0,1);
		String ac=c.toLowerCase();
      String ab=b.substring(0,x-y);
		System.out.println(as+ac+ab);




	}
}


