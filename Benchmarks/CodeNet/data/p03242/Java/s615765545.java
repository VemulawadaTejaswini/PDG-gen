import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = "";
        for(char c : a.toCharArray()){
            b += a(c);
        }
        System.out.println(b);
    }
    static String a(char c){
        if(c == '1'){
            return "9";
        }else{
            return "1";
        }
    }
}