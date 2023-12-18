import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = scan.nextInt();
        long balance = 100;
        int out = 0;
        while(balance < x){
            balance *= 1.01;
            out++;
        }
        System.out.println(out);
    }
}
