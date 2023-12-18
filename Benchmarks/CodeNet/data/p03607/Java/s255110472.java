import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> num = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            Integer a = sc.nextInt();
            if (num.contains(a)) {
                num.remove(num.indexOf(a));
            } else {
                num.add(a);
            }
        }
        System.out.println(num.size());
    }
}