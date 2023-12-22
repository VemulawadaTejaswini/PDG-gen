package aojWorkspace;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ここから自動入力
		Scanner sc = new Scanner(System.in);

		 int height = sc.nextInt();
		 int weight = sc.nextInt();

		 int area = height * weight;
		 int length = height * 2 + weight * 2;

		 System.out.println(area + " " + length);

	}

}

