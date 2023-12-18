
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		String s=sc.next();
		if(s.equals("bule"))
			h--;
		else
			n--;
		System.out.println(n+" "+h);




	}

}
