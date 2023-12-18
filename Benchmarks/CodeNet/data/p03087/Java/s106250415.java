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
        int count = 0;

        for(int i = 0; i < N; i++){
            a[i] = S.charAt(i);
        }

        for (int i = 0; i < Q; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        for(int i = 0; i < Q; i++){
            for(int j = l[i] - 1; j < r[i] - 1; j++){
                if(a[j] == 'A' && a[j + 1] == 'C'){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}