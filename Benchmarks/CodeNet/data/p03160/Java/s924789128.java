import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] a = new int[N + 1],f = new int[N + 1];
        for(int i = 1; i <= N; i ++) a[i] = sc.nextInt();
        for(int i = 2; i <= N; i++){
            if(i == 2)f[i] = f[i - 1] + Math.abs(a[i] - a[i - 1]);
            else f[i] = Math.min(Math.abs(a[i] - a[i - 1]) + f[i - 1],Math.abs(a[i] - a[i - 2]) + f[i - 2]);
        }
        System.out.println(f[N]);
    }
}