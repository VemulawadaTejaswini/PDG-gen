import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextInt();
        boolean[] history = new boolean[n];
        boolean success = false;

        int i = 0;
        int count = 0;
        while(true) {
            if(history[i]) break;
            if(i == 1) {
                success = true;
                break;
            }

            history[i] = true;
            i = a[i] - 1;
            count++;
        }

        String ans = success ? String.valueOf(count) : "-1";
        System.out.println(ans);
    }


}