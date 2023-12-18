import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(createString(sc.nextLine()));
        sc.close();
    }

    private static String createString(String ST) {
        String[] list = ST.split(" ");

        return list[1]+list[0];
    }
}