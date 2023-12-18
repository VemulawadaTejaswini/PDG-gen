import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int [M];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = sc.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        boolean requirement1 = Math.signum(Math.abs(Y) - Math.abs(X)) == 1 || Math.abs(Y) - Math.abs(X) == 0;
        boolean requirement2 = x[x.length-1] > X;
        boolean requirement3 = y[0] <= Y;
        if (requirement1 && requirement2 && requirement3) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}