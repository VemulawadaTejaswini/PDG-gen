
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();

        int res = 0;
        for(int i = L; i <= R; i++) {
            if(i%d==0) res++;
        }
        System.out.println(res);
    }

}
