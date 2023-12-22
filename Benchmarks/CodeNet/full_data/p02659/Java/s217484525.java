import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	String B = sc.next();
    	B = B.replace(".", "");

    	long b = Long.parseLong(B);

    	System.out.println(A*b/100);
    }
}
