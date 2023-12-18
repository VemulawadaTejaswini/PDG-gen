import java.util.*;


class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Math.min(A*N,B));
    }
}