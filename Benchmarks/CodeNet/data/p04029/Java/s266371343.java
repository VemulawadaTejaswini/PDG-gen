package Contest43;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int humanNumber = sc.nextInt();
		int candy = 0;
		for (int i = 1; i <= humanNumber; i++) {
			candy += i;
		}
		System.out.println("必要なキャンディーの個数：" + candy + "個");
	}

}