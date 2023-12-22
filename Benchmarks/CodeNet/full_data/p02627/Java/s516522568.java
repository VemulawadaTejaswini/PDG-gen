import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String a = sc.next();
        if(Character.isUpperCase(a.charAt(0)))
            System.out.println('A');
        else
            System.out.println('a');
    }
}