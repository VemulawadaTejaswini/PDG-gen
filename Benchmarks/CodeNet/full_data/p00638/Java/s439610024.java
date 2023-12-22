import java.util.*;

public class Main {
    public static void main(String[] args) {
        try(Scanner scn = new Scanner(System.in)) {
            int n;
            while((n = scn.nextInt()) > 0) {
                ArrayList<Island> islands = new ArrayList<>();
                while(n-- > 0) {
                    islands.add(new Island(scn.nextInt(), scn.nextInt()));
                }
                Collections.sort(islands);

                boolean fail = false;
                int weight = 0;
                for(Island island : islands) {
                    weight += island.getTreasure();
                    if(weight > island.getDurability()) {
                        fail = true;
                    }
                }

                System.out.println(fail ? "No" : "Yes");
            }
        }
    }
}

class Island implements Comparable<Island> {
    private int treasure;
    private int durability;

    public Island(int treasure, int durability) {
        this.treasure   = treasure;
        this.durability = durability;
    }

    public int getTreasure() {
        return treasure;
    }

    public int getDurability() {
        return durability;
    }

    public int compareTo(Island another) {
        return this.getDurability() > another.getDurability() ? 1 : -1;
    }
}