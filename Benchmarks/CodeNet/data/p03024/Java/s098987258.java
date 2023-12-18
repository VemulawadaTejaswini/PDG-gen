import java.util.Scanner;

//6/1コンテスト

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] fruit = a.split("");
		int win=0;
		int lose=0;

		for(int i= 0;fruit.length>i;i++) {
			if (fruit[i].equals("o")) {
				win++;
			}
			else if (fruit[i].equals("x")) {
				lose++;
			}
		}

		if(win<=8)
			System.out.println("YES");
		else if (lose<=8)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}