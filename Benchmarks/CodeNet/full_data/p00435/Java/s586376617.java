import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static String before, after;
    public static void main(String[] args) {
        read();
        slove();
    }
    static boolean read(){
        before = sc.nextLine();
        return true;
    }
    static void slove(){
        after = "";
        before = before.toLowerCase();
        for(int i = 0; i < before.length(); i++){
            char letter = before.charAt(i);
            char convert = (char)((letter -  'a' - 3)%26 + 'a');
            after += Character.toString(convert).toUpperCase();
        }

        System.out.println(after);
    }
}