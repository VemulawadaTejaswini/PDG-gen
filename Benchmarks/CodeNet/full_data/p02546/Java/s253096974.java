import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        String endS = S.substring(S.length() - 1);

        if (endS == "s") {
            S += "es";
        }else{
            S += "s";
        }

        sc.close();
    }
}