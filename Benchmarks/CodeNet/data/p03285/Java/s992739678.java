import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        boolean ans = false;
        for(int i = 0; i < 15; i++){
            int t = N < (7 * i) ? N : N - (7 * i);
            if(t % 4 == 0) {
                ans = true;
                break;
            }
        }
        if(ans) System.out.println("Yes");
        else System.out.println("No");

    }

}