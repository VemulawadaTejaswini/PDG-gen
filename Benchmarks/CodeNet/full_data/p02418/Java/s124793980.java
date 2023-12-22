import java.util.*;

public class Main {
    private static final Scanner scn = new Scanner(System.in);
    
    public static void main(String[] args) {
        String str = scn.next();
        str += str;
        System.out.println(str.indexOf(scn.next()) < 0 ? "No" : "Yes");
    }
}