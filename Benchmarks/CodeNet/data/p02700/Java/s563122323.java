import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

//    	File file = new File("src/in.txt");

        //コード
//    	Scanner sc = new Scanner(file);
    	Scanner sc = new Scanner(System.in);

    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int D = sc.nextInt();

    	boolean flag = true;

    	while(flag) {
    		C -= B;
    		if(B<=0) {
    			flag = false;
    		} else {
        		A -= D;
        		if(A<=0) {
        			flag = false;
        		}
    		}
    	}
    	if(C<=0) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}
    }

}