import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        String[] splitFirst = first.split("", 0);
        String[] splitSecond = second.split("", 0);
        String[] splitThird = third.split("", 0);

        System.out.println(splitFirst[0] + splitSecond[0] + splitThird[0]);
    }
}