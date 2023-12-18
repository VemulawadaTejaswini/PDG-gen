import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(s.charAt(0) + "" + (s.length() - 2) + s.charAt(s.length() - 1));
    }
}