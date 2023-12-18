import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	Long A = sc.nextLong();
    	Long B = sc.nextLong();
    	Long N = sc.nextLong();
    	Long max = A*Math.min(B-1,N)/B;
    	System.out.println(max);
    }
}