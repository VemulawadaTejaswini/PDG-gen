package abc065;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().start();
	}
	void start(){
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int dist = b - a;
		if(dist <= 0){
			System.out.println("delicious");
		}else if(dist <= x){
			System.out.println("safe");
		}else{
			System.out.println("dangerous");
		}
		in.close();
	}
}
