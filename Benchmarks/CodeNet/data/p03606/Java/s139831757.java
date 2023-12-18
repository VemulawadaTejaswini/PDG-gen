import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int l, r;
        long count = 0;
        for(int i=0; i<n; i++) {
            l = Integer.parseInt(sc.next());
            r = Integer.parseInt(sc.next());
            count += r-l+1;
        }
        System.out.println(count);
    }   
}