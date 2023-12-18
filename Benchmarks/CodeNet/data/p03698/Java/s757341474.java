import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for(int i = 0; i < s.length(); i++){
            for(int j = 1; j < s.length() - i; j++){
                if(s.charAt(i) == s.charAt(i + j)){
                    System.out.println("no");
                    System.exit(0);
                }
            }
        }
        System.out.println("yes");
    }
}