import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String day = sc.next();
        int t = 0;
        switch (day) {
            case "SUN": t = 7; break;
            case "MON": t = 6; break;
            case "TUE": t = 5; break;
            case "WED": t = 4; break;
            case "THU": t = 3; break;
            case "FRI": t = 2; break;
            case "SAT": t = 1; break;
        }
        System.out.println(t);
    }
}
