
import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String judge = "consonant";
        if(a == "a" || a == "i" || a == "u" || a == "e" || a == "o"){
            judge = "vowel";
        }
        System.out.println(judge);
    }
}