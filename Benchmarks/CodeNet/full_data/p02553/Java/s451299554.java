import java.util.*;

class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        
        if (a >= 0 && c >= 0) { // 両方とも正
            System.out.println(b * d);
        } else if (b <= 0 && d <= 0) { //両方とも負
            System.out.println(a * c);
        } else if (a >= 0 && d <= 0) {
            System.out.println(a * d);
        } else {
            System.out.println(b * c);
        }
                
    }
}