import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);
		
		int par =  b / a;
		double time = c + 0.5;
		
		int create = (int)Math.floor(par * time);
		System.out.println(create);
	}

}