
package atcoder139;
import java.util.Scanner;

public class Main{

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int count = 0;
        for(int i = 0 ; i <=2;i++){
        if(s.charAt(i) == t.charAt(i)){
        count++;
        }
        }
                    
        System.out.println(count);
    }
    
}
