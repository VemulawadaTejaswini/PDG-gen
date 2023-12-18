import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < number; i++) {
            list.add(Integer.parseInt(sc.next()));
        }
        int sum = 0;
        for(int i = 0; i < number; i++) {
            int max = list.remove(0);
            if(i % 2 == 0) {
                sum += max;
            } else {
                sum -= max;
            }
        }
        System.out.println(sum);
    }
}