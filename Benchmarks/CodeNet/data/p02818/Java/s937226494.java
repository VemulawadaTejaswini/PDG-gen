import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();
        while(K>1 ||A>1){
        	A--;
        	K--;
        }
        long a = B-K;
        System.out.println(A +" " + a);
    }

}
