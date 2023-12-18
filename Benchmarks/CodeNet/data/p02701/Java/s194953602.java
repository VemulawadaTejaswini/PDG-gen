import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] gatya = new String[sc.nextInt()];
        List<String> list = new ArrayList<>();

        for (int i = 0; i < gatya.length; i++) {
            gatya[i] = sc.next();
        }

        for (String a : gatya) {
            if (!list.contains(a)) {
                list.add(a);
            }
        }

        System.out.println(list.size());
    }
}