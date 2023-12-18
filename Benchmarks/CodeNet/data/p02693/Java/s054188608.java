import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);
    	int K = sc.nextInt();
    	int A = sc.nextInt();
    	int B = sc.nextInt();

    	if(A==B) {
    		if(A%K==0) {
    			System.out.println("OK");
    		}else {
    			System.out.println("NG");
    		}
    	} else {
        	int q = A/K;
        	int y = (q+1)*K;
        	if(y<=B) {
        		System.out.println("OK");
        	} else {
        		System.out.println("NG");
        	}
    	}

    }
}