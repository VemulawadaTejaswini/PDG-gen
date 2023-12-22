import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String[] s = sc2.nextLine().split("[\\s]+");
		for(int i=n+-1;i>=0;i--){
			System.out.print(s[i]);
			if(i != 0)System.out.print(" ");
		}
	}
}