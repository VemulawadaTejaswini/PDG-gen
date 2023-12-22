import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in) ;
		int s = S.nextInt();
		System.out.println(s/3600 + ":" + (s%3600)/60 + ":" + (s%3600)%60);
		
	}

}