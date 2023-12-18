import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char b=s.next().charAt(0);
		System.out.println(b=='A'?"T":b=='T'?"A":b=='C'?"G":"C");
	}
}