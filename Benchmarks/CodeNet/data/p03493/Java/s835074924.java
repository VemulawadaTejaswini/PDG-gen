import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s = in.next();
        int sum = 0;
        for (int i = 0; i < 3; i++){
            if (s.charAt(i) == '1')sum++;
        }
        System.out.println(sum);
    }
}