import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Round One
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list = Arrays.asList(1, 2, 3);
        list.remove(a);
        list.remove(b);
        System.out.println(list.get(0));
        sc.close();
    }
}
