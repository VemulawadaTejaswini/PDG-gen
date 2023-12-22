import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		while(true){
			int x = stdin.nextInt();
			int h = stdin.nextInt();
			if(x != 0 && h != 0) {
				double s = x*Math.sqrt(4*h*h+x*x) + x*x;
				System.out.println(s);
			} else{
				break;
			}
		}

	}
}