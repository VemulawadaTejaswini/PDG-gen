import java.util.*;


public class Main {
    public static void call(int n){
        int i = 1;
        do {
            int x = i;
            if ( x % 3 != 0 ){
                while( x != 0 ){
                    if ( x % 10 == 3 ){
                        System.out.printf(" %d", i);
                        break;
                    }
                    x /= 10;
                }
    
            } else {
                System.out.printf(" %d", i);
            }
        } while(++i <= n);
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        call(n);
    }
}

