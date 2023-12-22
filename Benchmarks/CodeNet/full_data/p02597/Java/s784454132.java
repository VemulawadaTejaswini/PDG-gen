import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int N = sc.nextInt();
        final String c = sc.next();
        
        int w = c.indexOf('W');
        int r = c.lastIndexOf('R');
        
        int count = 0;
        while (0 <= w && 0 <= r && w < r) {
            count++;
            w = c.indexOf('W', w + 1);
            r = c.lastIndexOf('R', r - 1);
        }
        
        System.out.println(count);
    }
}
