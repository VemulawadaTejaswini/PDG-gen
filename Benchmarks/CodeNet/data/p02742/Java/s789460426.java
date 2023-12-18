import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long tate = sc.nextInt();
        long yoko = sc.nextInt();

        if (tate == 1L || yoko == 1L) {
        	System.out.println(1);
        }

        long add = (tate % 2) * (yoko % 2);

        long menseki =tate * yoko;

        System.out.println((menseki + add) / 2);

	}

}