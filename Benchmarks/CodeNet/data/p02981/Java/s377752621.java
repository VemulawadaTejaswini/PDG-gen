import java.util.*;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if(a*N >= b) {
            System.out.println(b);
        }else {
            System.out.println(a * N);
        }
    }
}