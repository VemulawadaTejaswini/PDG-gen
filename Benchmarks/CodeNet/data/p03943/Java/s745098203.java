import java.util.Scanner;

/**
 *  http://abc047.contest.atcoder.jp/tasks/abc047_a
 * @author Cummin
 */
public class Main {
    public static void main(String[] args) {
        int A, B, C ;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if ((A==B+C)||(B==A+C)||(C==A+B)){
            System.out.println("Yes") ;
        } else {
            System.out.println("No") ;
        }

    }
    
}
