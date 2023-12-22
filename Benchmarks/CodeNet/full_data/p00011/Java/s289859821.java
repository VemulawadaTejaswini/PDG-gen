import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static long res = 0;
    public static int[] ary;
    public static void main(String[] args) throws Exception {
        int w = sc.nextInt();
        ary = new int[w+1];
        for (int i = 0; i <= w; i++) {
            ary[i] = i;
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String[] s = sc.next().split(",");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int t = ary[a];
            ary[a] = ary[b];
            ary[b] = t;
        }
        
        for (int i = 1; i <= w; i++) {
            System.out.println(ary[i]);
        }
    }
}