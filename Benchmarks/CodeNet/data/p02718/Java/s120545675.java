import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[] a = new int[N];
        double check = 0;
        for(int i = 0 ; i < N ; i++)
        {
            a[i] = sc.nextInt();
            check += a[i];
        };
        check *= 1/4f/M;
        int count = 0;
        while(N-1 >= 0)
        {
            count += (a[N-1] >= check) ? 1 : 0;
            N--;
        }
        System.out.println(count >= M ? "Yes" : "No");
    }
}