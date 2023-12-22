package aojWorkspace;

import java.util.Scanner;

public class Solve {

	public static void main(String[] args) {
		//ここから自動入力
		Scanner sc = new Scanner(System.in);
		String[] quiz = sc.next().split(" ");

		 int height = Integer.parseInt(quiz[0]);
		 int weight = Integer.parseInt(quiz[1]);

		 int area = height * weight;
		 int length = height * 2 + weight * 2;

		 System.out.println(area);
		 System.out.println(length);

	}

}

