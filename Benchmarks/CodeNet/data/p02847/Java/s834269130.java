import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int ans = 7;

        switch (s) {
            case "SUN":
                break;
            case "MON":
                ans = 6;
                break;
            case "TUE":
                ans = 5;
                break;
            case "WED":
                ans = 4;
                break;
            case "THU":
                ans = 3;
                break;
            case "FRI":
                ans = 2;
                break;
            case "SAT":
                ans = 1;
                break;
        }

        System.out.println(ans);
    }
}