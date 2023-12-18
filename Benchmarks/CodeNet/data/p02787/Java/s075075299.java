import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int numSpell = scanner.nextInt();
        List<Spell> spells = new ArrayList<>();
        for (int i = 0; i < numSpell; i++) {
            int attack = scanner.nextInt();
            int mana = scanner.nextInt();
            spells.add(new Spell(attack, mana));
        }
        scanner.close();
        long sumMana = find(spells, hp);
        System.out.println(sumMana);
    }

    private static Map<Integer, Integer> manaMap = new HashMap<>();
    private static int find(List<Spell> spells, int hp) {
        if(hp <= 0) {
            return 0;
        }
        if(manaMap.containsKey(hp)) return manaMap.get(hp);
        int minMana = Integer.MAX_VALUE;
        for(int i = 0; i < spells.size(); i++) {
            int mana = find(spells, hp - spells.get(i).atack) + spells.get(i).mana;
            minMana = Math.min(minMana, mana);
        }
        manaMap.put(hp, minMana);

        return minMana;
    }

    public static class Spell {
        int atack;
        int mana;
        Spell(int atack, int mana) {
            this.atack = atack;
            this.mana = mana;
        }
    }
}