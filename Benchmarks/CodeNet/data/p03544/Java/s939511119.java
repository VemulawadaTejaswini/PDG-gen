import java.util.Scanner;

public class Main {

    public static long solve(int x) {
        long [] arr = new long[x+1];
        arr[0] = 2;
        arr[1] = 1;
        for (int i = 2; i <= x; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[x];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        System.out.println(solve(s));
    }
}