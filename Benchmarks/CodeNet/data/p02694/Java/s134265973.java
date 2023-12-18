import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int  balance = 100;
        int out = 0;
        while(balance < x){
            balance *= 1.01;
            out++;
        }
        System.out.println(out);
    }
}