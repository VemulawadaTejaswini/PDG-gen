import java.util.*;
import java.lang.*;

public class Main {
    static boolean hardToInput(String code){
        for(int i=0; i<code.length()-1; i++){
            if(code.charAt(i)==code.charAt(i+1)) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        System.out.println(hardToInput(code) ? "Bad" : "Good");

    }
}