import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        String ans = "";
        for(int i = 0; i < n; i++){
            ans += a[i];
            ans += b[i];
        }
        System.out.println(ans);
    }
}

