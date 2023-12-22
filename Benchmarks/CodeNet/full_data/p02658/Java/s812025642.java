/*
 * @author- Vardhan Shah
@Roll no AU1841138
@date-//2019
@description
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    import java.util.Scanner;
/**
 *
 * @author vardh
 */
public class Main {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        long ans = 1;
        x=sc.nextInt();
        long[] arr = new long[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextLong();
        }
        //System.out.println(Math.pow(10, 18));
        for (int i = 0; i < x; i++) {
            ans *= arr[i];
            if (ans > (int)Math.pow(10, 18)) {
                System.out.println("-1");
                return;
            }
        }
        
        System.out.println(ans);
    }
}
