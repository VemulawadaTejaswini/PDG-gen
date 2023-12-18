import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		if(s.charAt(k-1)=='A') System.out.println(s.substring(0, k-1)+"a"+s.substring(k,n));
		else if(s.charAt(k-1)=='B') System.out.println(s.substring(0, k-1)+"b"+s.substring(k,n));
		else if(s.charAt(k-1)=='C') System.out.println(s.substring(0, k-1)+"c"+s.substring(k,n));
		in.close();
	}

}
