import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int a = 1;
        for(int i=0; i<n; i++) {
            if(a < k) a *= 2;
            else a += k;
        }
        System.out.println(a);
    }
}