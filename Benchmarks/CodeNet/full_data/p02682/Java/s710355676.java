import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scan = new Scanner(System.in);
        int A = Integer.parseInt(scan.next());
        int B = Integer.parseInt(scan.next());
        int C = Integer.parseInt(scan.next());
        int K = Integer.parseInt(scan.next());

        if(K <= A+B){
            System.out.println(A);
        } else {
            System.out.println(A-(K-A-B));
        }
    }

    public static void main(String[] args) {
	    Main main = new Main();
    }
}