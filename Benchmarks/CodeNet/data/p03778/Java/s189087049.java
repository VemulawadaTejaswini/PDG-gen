import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int distance = b - (a + w);

		if(w==b){
			System.out.println("0");
		}else if(distance<0){
			System.out.println((10+distance));
		}else {
			System.out.println(distance);
		}
	}
}
