import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int L = sc.nextInt();

    	float v = L*L*L/27;

    	System.out.println(String.format("%.8f", v));

    }

}
