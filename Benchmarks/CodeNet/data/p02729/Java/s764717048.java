import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(combi(n) + combi(m));
    }
    
    static int ruijou(int a) {
        if(a == 1) {
            return 1;
        }else {
            return a * ruijou(a-1);
        }
    }
    
    static int combi(int a) {
        if(a == 1) {
            return 0;
        }else if(a == 2) {
            return 1;
        }else {
            return ruijou(a) / 2 / ruijou(a - 2);
        }
    }
}