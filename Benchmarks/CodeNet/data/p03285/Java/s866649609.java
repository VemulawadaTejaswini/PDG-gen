import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Nドル
        boolean[] f = new boolean[N+1];
        f[0] = true;
        for (int i = 0; i < N; i++)
            if (f[i] && i + 4 <= N)
                f[i + 4] = true;
        for (int i = 0; i < N; i++)
            if (f[i] && i + 7 <= N)
                f[i + 7] = true;
        if(f[N])
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}
