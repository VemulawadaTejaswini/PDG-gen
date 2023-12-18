import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	long N = sc.nextLong();
    	long K = sc.nextLong();

    	long a = N%K;

    	long b = K - a;

    	if(a<=b){
    	   	System.out.println(a);
    	} else {
    		System.out.println(b);
    	}



    }
}