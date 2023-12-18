import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = ((N-1)*N)/2;
        System.out.printf("%d\n",ans);
    }
}
