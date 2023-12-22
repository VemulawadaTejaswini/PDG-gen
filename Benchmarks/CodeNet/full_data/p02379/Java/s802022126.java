import java.util.Scanner;
public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double xLen = (x1-x2)*(x1-x2);
		double yLen = (y1-y2)*(y1-y2);
		double ans = Math.sqrt(xLen + yLen);
		System.out.println(ans);
	}
	public static void main(String args[]){
		new Main().run();
	}
}