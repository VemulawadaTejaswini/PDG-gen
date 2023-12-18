import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        List<String> nList = Arrays.asList(n.split(""));
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Long.parseLong(nList.get(i));
        }
        if (Long.parseLong(n) % sum == 0) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
