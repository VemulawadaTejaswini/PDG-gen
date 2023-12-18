import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		int m=800;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = n*m;
		int y = n/15*200;
		System.out.println(x-y);
		scan.close();
	}
}