import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static String solve(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        boolean bool = false;
        for (int i = 0; i < alpha.length(); i++){
            bool = false;
            for (int x = 0; x < s.length(); x++){
                if (s.charAt(x) == alpha.charAt(i)){
                    bool = true;
                    break;
                }
            }
            if (!bool){
                return alpha.charAt(i)+"";
            }
        }
        return "None";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        System.out.println(solve(s));
    }
}