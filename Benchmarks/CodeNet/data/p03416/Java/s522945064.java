import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int count = 0;
        for(int i=A; i<=B; i++) {
            int num = i;
            int a = num % 10;
            num /= 10;
            int b = num % 10;
            num /= 10;
            int c = num % 10;
            num /= 10;
            int d = num % 10;
            num /= 10;
            int e = num;
            if(a == e && b == d) count++;
        }
        System.out.println(count);
    } 
}