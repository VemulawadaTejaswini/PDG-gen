import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = x % 100;
        int p = x / 100;
        int r = n / 5;
        if(r > p){
            System.out.println(0);
            return;
        }
        System.out.println(1);
    }
}