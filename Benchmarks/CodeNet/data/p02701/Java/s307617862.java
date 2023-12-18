import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> box = new ArrayList<>();
        int amount = sc.nextInt();
        String each = null;
        for (int i = 0; i < amount; i++) {
            box.add(sc.next());
        }
        List<String> list = new ArrayList<String>(new LinkedHashSet<>(box));
        System.out.println(list.size());
    }
}