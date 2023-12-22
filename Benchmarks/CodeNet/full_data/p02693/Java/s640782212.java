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
    	boolean result = false;

    	for(int i=A;i<=B;i++) {
    		if(i%K==0) {
    			result = true;
    			break;
    		}
    	}
    	if(result) {
    		System.out.println("OK");
    	} else {
    		System.out.println("NG");
    	}

    }
}