import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        List<Restaulant> listRestaulant = new ArrayList<Restaulant>();
        String x = kbd.nextLine();
        for (int i = 0; i < n; i++) {
            Restaulant temp = new Restaulant();
            temp.name = kbd.next();
            temp.point = kbd.nextInt();
            temp.index = i + 1;
            listRestaulant.add(temp);
        }
        
        listRestaulant.sort(Comparator.comparing(Restaulant::getName).thenComparing(Restaulant::getPoint).reversed());
        for (int j = 0; j < n; j++) {
            Restaulant temp = listRestaulant.get(j);
            System.out.println(temp.getIndex());
        }
    }
}

class Restaulant {
    String name;
    int point;
    int index;

    String getName() {
        return this.name;
    }

    int getPoint() {
        return this.point;
    }

    int getIndex() {
        return this.index;
    }
}
