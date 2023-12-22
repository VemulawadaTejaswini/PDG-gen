import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int temp = 0;
		int n = 1;
		while( (temp = Integer.parseInt(scan.next())) != 0 ){
			System.out.printf("Case %d: %d\n", n, temp);
			n++;
		}
		return;
	}
}