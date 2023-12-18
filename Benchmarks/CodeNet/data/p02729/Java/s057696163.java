import java.util.Scanner;

public class atcoder1 {
    public static int tinh(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;
        N = sc.nextInt();
        M = sc.nextInt();
        System.out.println(tinh(N) + tinh(M));
    }
}