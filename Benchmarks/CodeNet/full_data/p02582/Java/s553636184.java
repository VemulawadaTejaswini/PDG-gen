
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.equalsIgnoreCase("SRS")
                || s.equalsIgnoreCase("SSR")
                || s.equalsIgnoreCase("RSS")
                || s.equalsIgnoreCase("RSR")) {
            System.out.println(1);
        }
        else if(!s.contains("R")){
            System.out.println(0);
        }
        else if(s.equalsIgnoreCase("RRR")){
            System.out.println(3);
        }
        else System.out.println(2);
    }
}
