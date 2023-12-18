import java.lang.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int fh = n/500;
    n= n - (fh*500);
    int f = n/5;
    long ans = (fh*1000)+(f*5);
    System.out.print(ans);
    }
}