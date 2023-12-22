import java.io.IOException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args)throws IOException {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=Integer.parseInt(sc.next());
		b=Integer.parseInt(sc.next());

		if(a==b){
			System.out.println("a == b");

		}else if(a>b){
			System.out.println("a > b");
		}else{
			System.out.println("a < b");
		}
		sc.close();

	}





}