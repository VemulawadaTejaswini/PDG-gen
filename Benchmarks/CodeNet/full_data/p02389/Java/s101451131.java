
import java.util.Scanner;


public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int width = sc.nextInt();

		long area = (long)height * width;
		long length = (long)height*2 +(long)width*2;
		System.out.println(area +" "+length);

		sc.close();
	}

}