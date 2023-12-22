import java.util.Scanner;
public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int h = num/(60*60); num = num - (h*60*60);
		int m = num/60; num = num - (m*60);
		int s = num;
		System.out.println(h+":"+m+":"+s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}

