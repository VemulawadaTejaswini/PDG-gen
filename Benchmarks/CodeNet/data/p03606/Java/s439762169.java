import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int group = in.nextInt();
        int total = 0;
        for (int i = 0; i < group; i++){
            int start = in.nextInt();
            int finish = in.nextInt();
            total += finish - start + 1;
        }
        System.out.println(total);
    }
}