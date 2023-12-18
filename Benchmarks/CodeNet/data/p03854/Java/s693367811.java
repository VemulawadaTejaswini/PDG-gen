import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            String src = sc.nextLine();
            String res = src.replaceAll("dreamer", "").replaceAll("dream", "").replaceAll("eraser", "").replaceAll("erase", "");
            System.out.println(res.length() == 0 ? "YES" : "NO");
        }
    }
}