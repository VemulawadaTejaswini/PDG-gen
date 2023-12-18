import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = y%x;
        if (z==0) {
            System.out.println(x+y);
        }else{
            System.out.println(y-x);
        }
        
    }
    
}