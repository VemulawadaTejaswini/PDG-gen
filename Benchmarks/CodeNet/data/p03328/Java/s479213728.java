import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = b - a;

        int ans = kaijou(diff);

        System.out.println(ans - b);
    }

    public static int kaijou(int n){
        if(n == 1){
            return 1;
        }
        return n + kaijou(n-1);
    }
}
