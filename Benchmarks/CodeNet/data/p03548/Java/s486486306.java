

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int meu = x / (y + z);
		System.out.println((x % (y + z) >= z) ? meu : meu - 1);
	}
}
