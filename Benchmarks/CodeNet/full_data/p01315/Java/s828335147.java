import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            Plant[] plants = new Plant[n];
            for (int i = 0; i < n; i++) {
                plants[i] = new Plant(sc.next(), sc.nextInt(), sc.nextInt() + sc.nextInt() + sc.nextInt(), sc.nextInt() + sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(plants);
            for (int i = 0; i < n; i++) {
                sb.append(plants[i].name).append("\n");
            }
            sb.append("#\n");
        }
        System.out.print(sb);
    }
    
    static class Plant implements Comparable<Plant> {
        String name;
        int income;
        int time;
        
        public Plant(String name, int cost, int firstTime, int everyTime, int count, int price, int dup) {
            this.name = name;
            income = count * price * dup - cost;
            time = dup * everyTime + firstTime;
        }
        
        public int compareTo(Plant another) {
            if (another.income * time == income * another.time) {
                return name.compareTo(another.name);
            } else {
                return another.income * time - income * another.time;
            }
        }
    }
}

