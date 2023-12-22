import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int c = reader.nextInt();
		if ((a < b) && (b < c)){
			System.out.println("YES");
		} else {System.out.println("NO");}
	}
}