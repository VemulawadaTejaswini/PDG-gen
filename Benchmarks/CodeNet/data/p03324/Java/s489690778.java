import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int A = sc.nextInt();
        int B=sc.nextInt();
        int C=(int)Math.pow(100,A)*B;
        
        System.out.print(C);
	}

}