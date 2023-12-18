import java.util.*;

public class Main {
    static int n;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = sc.nextInt() / 1000;
        paper10000(sum);
        System.out.println(-1 +" " + -1 + " " + -1);
    }
    
    static void paper10000(int num) {
        int p = 10;
        for(int x = num/p; x >= 0; x--) {
            paper5000(num - x*p, x);
        }
    }
    
    static void paper5000(int num, int x) {
        int p = 5;
        for(int y = num/p; y >= 0; y--) {
            paper1000(num - y*p, x, y);
        }
    }
    
    static void paper1000(int num, int x, int y) {
        if(num+x+y == n) {
            System.out.println(x +" " + y + " " + num);
            System.exit(0);
        }
    }
}