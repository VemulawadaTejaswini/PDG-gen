import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        String k = sc.next();
        if (k.length()<=19){
            long K = Long.parseLong(k);
            if (K%2==1){
                System.out.println(b-a);
            }else {
                System.out.println(a-b);
            }
        }else System.out.println("Unfair");


    }
}
