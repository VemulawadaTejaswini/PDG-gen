import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int total = 0;
        while (n != 0){
            if (k > 0){
                total += x;
                k--;
                n--;
            }
            else {
                total += y;
                n--;
            }
        }
        System.out.println(total);
    }
}