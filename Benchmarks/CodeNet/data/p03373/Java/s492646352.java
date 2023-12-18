import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(c * 2 >= a + b) {
            System.out.println(a * x + b * y);
            return;
        }
        List<Integer> array = new ArrayList<>();
        array.add(a * x + b * y);
        array.add(2 * c * Math.max(x, y));
        if(x > y) {
            array.add(2 * c * y + a * (x -y));
        }
        else {
            array.add(2 * c * x + b * ( y - x));
        }
        System.out.println(array.stream().mapToInt(Integer::valueOf).min().getAsInt());
    }
}


