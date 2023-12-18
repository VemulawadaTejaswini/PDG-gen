import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();
        int out = 0;
        if(k <= a + b){
            out = k;
        }else{
            out = a;
            out -= k - a - b;
        }
        System.out.println(out);
    }
}