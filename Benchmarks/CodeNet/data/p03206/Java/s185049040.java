import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String message = "";
        switch (a) {
            case 25: message = "Christmas";
                break;
            case 24: message = "Christmas Eve";
                break;
            case 23: message = "Christmas Eve Eve";
                break;
            case 22: message = "Christmas Eve Eve Eve";
                break;
        }
        System.out.println(message);
    }
}
