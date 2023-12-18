import java.util.Scanner;

public class Main {

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        Integer towns = Integer.parseInt(sc.nextLine());
        String[] Monsters = sc.nextLine().split(" ");
        String[] Braves = sc.nextLine().split(" ");

        int huntCount = 0;
        for (int i = 0; i < towns; i++) {
            int firstMonsters = Integer.parseInt(Monsters[i]);
            int bravePower = Integer.parseInt(Braves[i]);

            if (firstMonsters <= bravePower) {
                // 1つ目の町は全滅できる
                huntCount += firstMonsters;

                if (Monsters.length < i) {
                    // 最後の町の場合は加算しない
                    break;
                }

                int secondMonsters = Integer.parseInt(Monsters[i + 1]);
                int remainBravePower = bravePower - firstMonsters;
                if (remainBravePower >= secondMonsters) {
                    huntCount += secondMonsters;
                } else {
                    huntCount += remainBravePower;
                }
            } else {
                huntCount += bravePower;
            }
        }

        System.out.println(huntCount);
    }
}
