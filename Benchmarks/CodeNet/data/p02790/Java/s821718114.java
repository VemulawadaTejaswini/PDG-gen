
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        
        StringBuilder sb = new StringBuilder();
        
        if(a.charAt(0) >= b.charAt(0)){
            for(int i = 0; i < a.length(); i++){
                sb.append(b.charAt(0));
            }
        } else {
            for(int i = 0; i < b.length(); i++){
                sb.append(a.charAt(0));
            }
        }
        
        System.out.println(sb);
    }
}
