
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        HashSet<Integer> integers = new HashSet<>();
        integers.add(in.nextInt());
        integers.add(in.nextInt());
        integers.add(in.nextInt());
        System.out.println(integers.size() == 2 ? "Yes" : "No");
    }
}
