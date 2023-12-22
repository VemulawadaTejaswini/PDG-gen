import java.util.Scanner;
     
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        class Monster {
            int hp;
            int attack;

            Monster(int hp0, int attack0) {
                hp = hp0;
                attack = attack0;
            }
        }

        Monster takahashiMonster = new Monster(
            scan.nextInt(),
            scan.nextInt()
        );
        Monster aokiMonster = new Monster(
            scan.nextInt(),
            scan.nextInt()
        );

        while(takahashiMonster.hp > 0 && aokiMonster.hp > 0) {
            aokiMonster.hp -= takahashiMonster.attack;

            if(aokiMonster.hp > 0) {
                takahashiMonster.hp -= aokiMonster.attack;
            }
        }

        if(takahashiMonster.hp > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
        return;
    }
}