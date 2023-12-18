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
    	Long max = (long) 0;

    	for(int x=0;x<=Math.min(B-1, N);x++) {

    		Long tmp = (A*x)/B;
    		if (tmp>max) {
    			max = tmp;
    		}
    	}
    	System.out.println(max);
    }
}
