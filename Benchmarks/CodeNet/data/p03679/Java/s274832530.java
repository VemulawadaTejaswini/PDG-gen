import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int next = 1;
        int count = 0;
        for (int i=1; i<=n; i++) {            
            a[i] = sc.nextInt();
            while (next <= i) {
                next = a[next];
                count++;
                if (next == 1) {
                    System.out.println("-1");
                    return;
                }
                if (next == 2) {
                    System.out.println(count);
                    return;
                }
            }
        }
        
        while (true) {
            next = a[next];
            count++;
            if (next == 1) {
                System.out.println("-1");
                return;
            }
            if (next == 2) {
                System.out.println(count);
                return;
            }
        }
    }
}