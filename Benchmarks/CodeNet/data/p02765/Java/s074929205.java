import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String ss = sc.next();


        int N = Integer.parseInt(s);
        int R = Integer.parseInt(ss);

		System.out.println(R + (100*(10-N)));
	}
}