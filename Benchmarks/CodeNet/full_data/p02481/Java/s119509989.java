import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int height=scanner.nextInt();
		int width=scanner.nextInt();
		System.out.print(height*width+" ");
		System.out.println(width*2+height*2);
		scanner.close();
	}

}