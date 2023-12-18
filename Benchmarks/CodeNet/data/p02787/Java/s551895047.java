import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int n = scanner.nextInt();
        List<Integer> damages = new ArrayList<>(n);
        List<Integer> costs = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            int c = scanner.nextInt();
            damages.add(d);
            costs.add(c);
        }
        int[] damage2cost = new int[hp + 1];
        for (int less_hp = 1; less_hp <= hp; less_hp++) {
            int minimam_cost = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int last_damage = damages.get(i);
                int last_cost = costs.get(i);
                int rest_hp = less_hp - last_damage;
                int cost;
                if(rest_hp < 0){
                    cost = last_cost;
                }else{
                    cost = last_cost + damage2cost[rest_hp];
                }
                if(cost < minimam_cost){
                    minimam_cost = cost;
                }
            }
            damage2cost[less_hp] = minimam_cost;
        }
        System.out.println(damage2cost[hp]);
    }
}