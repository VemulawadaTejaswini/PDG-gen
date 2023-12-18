import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int w = sc.nextInt();
        for (int i = 0; i < s.length(); i++) {
            if (i % w == 0) {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
    }    
}
