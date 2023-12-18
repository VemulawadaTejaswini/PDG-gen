import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        in.nextLine();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextLine());
        }
        System.out.println(set.size());
    }
}
