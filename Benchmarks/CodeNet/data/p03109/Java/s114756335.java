import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] d = sc.nextLine().split("/");

        System.out.println(Integer.parseInt(d[1]) > 4 ? "TBD" : "Heisei");
    }
}