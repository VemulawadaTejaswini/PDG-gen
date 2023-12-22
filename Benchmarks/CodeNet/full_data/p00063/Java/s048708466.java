import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		while(sc.hasNext()){
			String s = sc.next();
			if(s.equals((new StringBuffer(s)).reverse().toString()))n++;
		}
		System.out.println(c);
	}
}