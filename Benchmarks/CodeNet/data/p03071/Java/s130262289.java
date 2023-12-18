import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int larger = Math.max(A,B);
        int smaller = Math.min(A,B);

        int ans = larger;
        larger--;
        ans += Math.max(larger, smaller);

        System.out.println(ans);


    }
}
