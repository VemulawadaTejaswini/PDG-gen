import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int C = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        boolean takahashiWin = false;

        while (true) {
            C -= B;
            if(C<=0 ) {
                takahashiWin = true;
                break;
            }
            
            A -= D;
            if(A<=0) {
                takahashiWin = false;
                break;
            }
        }

        System.out.println(takahashiWin ? "Yes" : "No");
    }

}
