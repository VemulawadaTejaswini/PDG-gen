import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String S = scanner.next();
        int l[] = new int[Q];
        int r[] = new int[Q];
        char a[] = new char[N];
        int count[] = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = S.charAt(i);
        }

        for (int i = 0; i < Q; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int sum[] = new int[N];

        for(int i = 0; i < N - 1; i++){
            if(a[i] == 'A' && a[i + 1] == 'C'){
                count[i + 1] += 1;
            }
        }

        for(int i = 1; i < N; i++){
            sum[i] += count[i] + sum[i - 1];
        }

        for(int i = 0; i < Q; i++){
            int total = sum[r[i] - 1] - sum[l[i] - 1];
            System.out.println(total);
        }
    }
}