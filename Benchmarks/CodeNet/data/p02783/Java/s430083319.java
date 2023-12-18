import java.util.*;

class AtCoder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        try {
            int health = in.nextInt();
            int damage = in.nextInt();

            int total_attacks = (health / damage);

            if (health % damage != 0)
                total_attacks++;

            System.out.println(total_attacks);
            in.close();
        } catch (Exception e) {
            return;
        }
    }
}