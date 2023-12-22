package volune000;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			System.out.println(Integer.toString(x+y).length());
		}
	}
}