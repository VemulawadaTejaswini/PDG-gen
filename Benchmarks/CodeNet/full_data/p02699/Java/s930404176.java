import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int S = sc.nextInt();
    	int W = sc.nextInt();

    	if(W>=S) {
    		System.out.println("unsafe");
    	} else {
    		System.out.println("safe");
    	}

    }

}