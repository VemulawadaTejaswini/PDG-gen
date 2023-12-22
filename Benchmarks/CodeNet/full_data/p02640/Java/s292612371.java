import java.util.*;

class Main
{
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y = sc.nextInt();
        int x = sc.nextInt();
        
        if (x % 2 != 0 || x < 2 * y || x > 4 * y) {
            System.out.println("No");
            return;
        }
        
        System.out.println("Yes");
        
    }
}