

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuilder a = new StringBuilder(in.next());
		StringBuilder b = new StringBuilder(in.next());
		int num = new Integer(a.append(b).toString());
		int sn = (int)Math.sqrt(num);
		if(sn * sn == num)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
