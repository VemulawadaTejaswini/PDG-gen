import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tate = sc.nextInt(); //縦
		int yoko = sc.nextInt(); //横
		
		System.out.print(tate*yoko + " ");
		System.out.print((tate+yoko)*2);
	}
}