import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Monster a = new Monster(scanner.nextInt(), scanner.nextInt());
        Monster b = new Monster(scanner.nextInt(), scanner.nextInt());

        while (true) {
            b.hp = b.hp - a.attack;
            if (b.hp <= 0) {
                System.out.println("Yes");
                System.exit(0);
            }

            a.hp = a.hp - b.attack;
            if (a.hp <= 0) {
                System.out.println("No");
                System.exit(0);
            }
        }

    }

    static class Monster {
        int hp;
        int attack;

        public Monster(int hp, int attack) {
            this.hp = hp;
            this.attack = attack;
        }
    }


}