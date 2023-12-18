import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] d = new int[N+1];
        d[0] = 0;
        int count = 0;
        for (int i = 1; i < N+1; i++) {
            int li = sc.nextInt();
            d[i] = d[i-1]+li;
            if (d[i] <= X) {
                count++;
            }
        }
        System.out.println(count+1);
    }
}