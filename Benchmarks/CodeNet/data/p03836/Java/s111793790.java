import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int tx = sc.nextInt();
		int ty = sc.nextInt();

		int disX = tx-sx;//distaneX
		int disY = ty-sy;//distanceY
		for(int i=0;i<disY;i++) System.out.print("U");
		for(int i=0;i<disX;i++) System.out.print("R");
		for(int i=0;i<disY;i++) System.out.print("D");
		for(int i=0;i<=disX;i++) System.out.print("L");
		for(int i=0;i<=disY;i++) System.out.print("U");
		for(int i=0;i<=disX;i++) System.out.print("R");
		System.out.print("DR");
		for(int i=0;i<=disY;i++) System.out.print("D");
		for(int i=0;i<=disX;i++) System.out.print("L");
		System.out.println("U");

	}
}