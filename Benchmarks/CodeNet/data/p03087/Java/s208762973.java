import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        String S = sc.next();
        int count = 0;
        int[] table = new int[N+1];

        table[0] = 0;
        for(int i = 1; i<=N; i++) {
            if ( i != N && S.charAt(i-1) == 'A' && S.charAt(i) == 'C') {
                count++;
            }
            table[i] = count;
        }

        System.out.println("");
        for (int i = 0; i <= N; i++) {
            System.out.print(i);
        }
        System.out.println("");
        System.out.print(" ");
        System.out.println(S);
        for (int i = 0; i <= N; i++) {
            System.out.print(table[i]);
        }
        System.out.println("");

        for (int i = 0; i<Q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println("l:" + l + ", r:" + r);
            System.out.println((table[r-1])-(table[l-1]));
        }
    }
}