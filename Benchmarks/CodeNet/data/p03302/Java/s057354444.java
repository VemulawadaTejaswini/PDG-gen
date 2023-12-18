import java.io.InputStream;
import java.util.Scanner;

public class Main {


	public static void main(String args[]) {
        InputStream inputStream = System.in;
        Scanner sc = new Scanner(inputStream);
        String out;
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A+B==15) {
        System.out.print("+");
        }
        else if(A*B==15) {
            System.out.print("*");
            }
        else {
            System.out.print("x");
            }
	}

}