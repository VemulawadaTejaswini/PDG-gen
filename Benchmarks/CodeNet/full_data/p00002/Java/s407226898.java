import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=200; i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(Integer.toString(a+b).length());
		}
	}

}