import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t = 0;
        while(n > 0) {
          n /= k;
          t++;
        }
        System.out.println(t);
    }
}