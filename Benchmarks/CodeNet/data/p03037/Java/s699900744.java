import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), M = sc.nextInt();

        int min = sc.nextInt(), max = sc.nextInt();
        for (int i=0; i<M-1; i++) {
            int L = sc.nextInt(), R = sc.nextInt();
            if (L > min) min = L;
            if (R < max) max = M;
        }
        int result = 0;
        if ((max-min)>=0) {
            System.out.println(max-min+1);
        } else {
            System.out.println(result);
        }
        // System.out.println(max-min+1);
    }
}