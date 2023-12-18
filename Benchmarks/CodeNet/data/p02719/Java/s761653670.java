import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int K = sc.nextInt();

    	int a = N%K;

    	int b = K - a;

    	if(a<=b){
    	   	System.out.println(a);
    	} else {
    		System.out.println(b);
    	}



    }
}