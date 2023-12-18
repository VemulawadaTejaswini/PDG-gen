import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String youbi = sc.next();
        int ans = 0;

        switch (youbi) {
            case "SUN":
                ans = 7;
            case "MON":
                ans = 6;
            case "TUE":
                ans = 5;
            case "WED":
                ans = 4;
            case "THU":
                ans = 3;
            case "FRI":
                ans = 2;
            case "SAT":
                ans = 1;
        }

        System.out.println(ans);
    }

}
