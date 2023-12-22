import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	double A = sc.nextDouble();
    	double B = sc.nextDouble();

    	long times2 = (long) (A*B*1000);
    	long times = (times2 - times2%1000)/1000;
    	System.out.println(times);
    }
}
