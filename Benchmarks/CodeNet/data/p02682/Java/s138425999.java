import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
//    	File file = new File("src/in.txt");
//    	Scanner sc = new Scanner(file);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	int K = sc.nextInt();

    	int a = 0;
    	int b = 0;
    	int c = 0;

    	if(K<=A) {
    		a = K;
    	} else {
    		a = A;
    		if(K-A<=B) {
    			b = K-A;
    		} else {
    			b = B;
    		}
    	}
    	c = K-a-b;
    	int sum = a - c;
    	System.out.println(sum);
    }
}