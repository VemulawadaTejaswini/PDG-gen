import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String str = String.valueOf(num);
        
        for(int i = 0; i < 2; ++i) {
            if(((str.charAt(i) == str.charAt(i + 1))) && (str.charAt(i + 1) == str.charAt(i + 2))) {
                System.out.println("Yes");
                break;
            }
             else {
               System.out.println("No");
             }
        }
    }
}