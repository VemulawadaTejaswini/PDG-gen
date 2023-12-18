import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);

    	Scanner sc = new Scanner(System.in);

    	int X = sc.nextInt();

    	while(IsPrime(X)==false) {
    		X ++;
    	}
    	System.out.println(X);


    }

    private static boolean IsPrime(int num)
    {
        if (num < 2) return false;
        else if (num == 2) return true;
        else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

        for (int i = 3; i < num; i+=2)
        {
            if (num % i == 0)
            {
                // 素数ではない
                return false;
            }
        }

        // 素数である
        return true;
    }
}