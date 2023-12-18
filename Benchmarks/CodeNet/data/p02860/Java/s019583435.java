
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        int N;
        String S;

        try (Scanner sc = new Scanner(System.in)) {
            N = sc.nextInt();
            S = sc.next();

        }
        if(N%2 != 0){
            System.out.println("No");
            return;
        }
        char[] c = S.toCharArray();

        for(int i = 0; i < N/2; i++){
            if(c[i] != c[i+N/2]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }
}
