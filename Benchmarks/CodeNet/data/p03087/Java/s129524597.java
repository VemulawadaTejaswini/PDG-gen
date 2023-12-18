import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();

        // N回計算を繰り返す
        int L = 0;
        int R = 0;
        char firstletter = 'A';
        char lastletter = 'A';
        for (int i=0; i<Q; i++) {
            L = sc.nextInt();
            R = sc.nextInt();

            int count = 0;
            for (int j=L-1; j<R-1; j++) {
                firstletter = S.charAt(j);
                lastletter = S.charAt(j+1);
                if (firstletter=='A' && lastletter=='C') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}