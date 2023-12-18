import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        long K = scan.nextLong();

        if(K <= A){
            System.out.println(K);
        } else if(K <= A+B){
            System.out.println(A);
        } else {
            System.out.println(A-(K-A-B));
        }
    }

    public static void main(String[] args) {
	    Main main = new Main();
    }
}
