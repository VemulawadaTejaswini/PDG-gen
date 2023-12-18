public class Main {
    public static void main (String args[]) {
        long[] L = new long[87];
        L[0] = 2;
        L[1] = 1;
        for (int i = 2; i < 86; i++) {
            L[i] = L[i-1] + L[i-2];
        }
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(L[N]);
    }
}