import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HP;
        int amount;

        HP = sc.nextInt();
        amount = sc.nextInt();

        List<Integer> attack = new ArrayList<>();

        for (int i = 0; i < amount; i++) {
            attack.add(sc.nextInt());
        }
        int sum = 0;
        for (int i = 0; i < attack.size(); i++) {
            sum += attack.get(i);
        }
        if (sum >= HP) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}