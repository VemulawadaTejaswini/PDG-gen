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
        long sumMana = find(spells, hp, 0, Integer.MAX_VALUE, new ArrayList<>());
        System.out.println(sumMana);
//        Collections.sort(manaList);
//        System.out.println(manaList);
    }

    private static Map<Integer, Integer> manaMap = new HashMap<>();
    private static List<Integer> manaList = new ArrayList<>();
    private static int find(List<Spell> spells, int hp, int sumMana, int minMana, List<Integer> current) {
        if(hp <= 0) {
//            System.out.println(current + ", sum = "+sumMana);
//            manaList.add(sumMana);
            return sumMana;
        }
        if(manaMap.containsKey(hp)) return manaMap.get(hp);
        for(int i = 0; i < spells.size(); i++) {
//            current.add(spells.get(i).atack);
            int mana = find(spells, hp - spells.get(i).atack, sumMana+spells.get(i).mana, minMana, current);
            minMana = Math.min(minMana, mana);
            manaMap.put(hp, minMana);
//            current.remove(current.size()-1);
        }

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
