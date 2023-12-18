import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs[] = sc.nextLine().split("");
        String old = "";
        for (String str : strs) {
            if ((!old.equals("")) && old.equals(str)) {
                System.out.println("Bad");
                return;
            }
            old = str;
        }
        System.out.println("Good");
    }
}
