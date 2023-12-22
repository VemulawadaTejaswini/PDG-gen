import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
    
        System.out.println(gcd(x, y));
    }
    
    static int gcd(int x, int y){
        if(x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        while(y > 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}
