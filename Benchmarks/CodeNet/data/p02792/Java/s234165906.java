import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long count = 0;
        for (int i = 1; i <=n; i++) {
           for (int j = 1; j <= n; j++) {
               String a = Integer.toString(i);
               String b = Integer.toString(j);
               if (a.charAt(0) == b.charAt(b.length() -1) && a.charAt(a.length() - 1) == b.charAt(0)) {
                   count++;
               }
           }
        }
        System.out.println(count);
    }
}