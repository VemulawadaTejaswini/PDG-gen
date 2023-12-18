import java.util.Scanner;

/**
 * Created by suzuki on 17/06/24.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < B) {
            System.out.println("delicious");
        }else if(X < B){
            System.out.println("safe");
        }else {
            System.out.println("dangerous");
        }
    }
}