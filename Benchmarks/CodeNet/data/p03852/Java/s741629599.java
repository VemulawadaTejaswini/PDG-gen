
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String judge = "consonant";
        if(a.equals("a") || a.equals("i") || a.equals("u") || a.equals("e") || a.equals("o")){
            judge = "vowel";
        }
        System.out.println(judge);
    }
}