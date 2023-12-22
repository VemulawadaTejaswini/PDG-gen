import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int k=scn.nextInt();
		String s=scn.next();
		if(s.length()<=k)
			System.out.println(s);
		else 
			System.out.println(s.substring(0, k)+"...");
	}

}
