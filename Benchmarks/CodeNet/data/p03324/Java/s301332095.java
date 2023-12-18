import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if(D == 0) {
            System.out.println(N);
        } else {
            System.out.println(N * (int)Math.pow(100, D));
        }
    }
}
