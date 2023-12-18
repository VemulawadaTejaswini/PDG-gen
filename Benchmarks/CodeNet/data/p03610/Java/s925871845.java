import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        String new_s = "";
        for (int i = 0; i < s.length(); i++){
            if (i % 2 == 0){
                new_s += s.charAt(i);
            }
        }
        System.out.println(new_s);
    }
}