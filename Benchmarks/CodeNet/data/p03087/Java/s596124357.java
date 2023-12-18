import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        String S = sc.next();
        int[] L = new int[Q];
        int[] R = new int[Q];

        for (int i=0; i<Q; i++) {
            L[i] = sc.nextInt();
            R[i] = sc.nextInt();
        }

        // N回計算を繰り返す
        char firstletter = 'A';
        char lastletter = 'A';
        for (int i=0; i<Q; i++) {
            int count = 0;
            for (int j=L[i]-1; j<R[i]-1; j++) {
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