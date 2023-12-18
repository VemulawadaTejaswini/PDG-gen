import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		sc.next();
		String s = sc.next();

		String[] line = s.split("",0);

		System.out.println("A"+line[0]+"C");
	}
}
