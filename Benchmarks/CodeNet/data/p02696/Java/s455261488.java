import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), N = sc.nextInt();
        int l = 1, r = N;

        while(l < r) {
            int m = l + ((r - l) >> 1);
            if(Math.floor(A*m/B)-1 - A*(Math.floor(m/B)-1) > N) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        System.out.print(l);

    }
}
