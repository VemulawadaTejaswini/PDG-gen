import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 1000 * (x / 500);
        x %= 500;
        ans += 5 * (x / 5);
        System.out.println(ans);
    }

}