
import java.util.Scanner;

public class Main {
    static int[] a;
    static boolean[] canMake = new boolean[20*2000 + 1];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] m = new int[q];
        for (int i = 0; i < q; i++) {
            m[i] = sc.nextInt();
        }
        
        setCanMake(0, 0);
        canMake[0] = false;
//        UArr.printArr(canMake);
        for (int i = 0; i < q; i++)
            System.out.println(canMake[m[i]] ? "Yes" : "No");
        
    }
    
    private static void setCanMake(int sum, int n) {
        if (n == a.length - 1) {
            canMake[sum] = true;
            canMake[sum + a[n]] = true;
        } else {
            setCanMake(sum, n + 1);
            setCanMake(sum + a[n], n + 1);
        }
    }
}
