import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char a[] = new char[N];
        String s = sc.next();
        a = s.toCharArray();

        String result = "";

        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                if (a[i] != a[j]) {
                    result += a[i];
                    i = j;
                }
            }
            if ( i == N -1 ) {
                result += a[i];
            }
        }

        System.out.println(result.length());
    }
}
