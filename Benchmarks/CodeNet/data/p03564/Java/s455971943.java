import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int m = 1;

        for (int i = 0; i < n; i++){
            if (A(m) <= B(m, k)){
                m = A(m);
            }
            else {
                m = B(m, k);
            }
        }

        System.out.println(m);
    }

    /**
     * Double the value
     * @param n
     * @return
     */
    public static int A (int n){
        return n * 2;
    }

    /**
     * N + k
     * @param n
     * @return
     */
    public static int B(int n, int k){
        return n + k;
    }

}
