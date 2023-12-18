import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.equals("Sunny")) {
            S = "Cloudy";
        }
        else if (S.equals("Cloudy")) {
            S = "Rainy";
        }
        else {
            S = "Sunny";
        }
        System.out.println(S);
    }
}