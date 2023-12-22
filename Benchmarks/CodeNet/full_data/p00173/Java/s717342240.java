import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.next();
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(str + " " + (a + b) + " " + (a*200 + b * 300));
		}
	}
}