import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while (s.contains("0B") || s.contains("1B")) {

            s.replace("0B", "");
            s.replace("1B", "");


        }s.replace("B","");
        System.out.println(s);


    }
}