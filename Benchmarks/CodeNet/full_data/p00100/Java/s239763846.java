import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            List<SalesData> list = new ArrayList<>();
            while (n-- > 0) {
                SalesData data = new SalesData(sc.nextInt(), sc.nextInt(), sc.nextInt());
                if (list.isEmpty()) {
                    list.add(data);
                } else if (!isAdded(list, data)) {
                    list.add(data);
                }
            }
            boolean notOver = true;
            for (SalesData s : list) {
                if (s.amount >= 1000000) {
                    notOver = false;
                    System.out.println(s.id);
                }
            }
            if (notOver) {
                System.out.println("NA");
            }
            list.clear();
        }
    }

    static boolean isAdded(List<SalesData> list, SalesData data) {
        for (SalesData s : list) {
            if (s.id == data.id) {
                s.amount += data.amount;
                return true;
            }
        }
        return false;
    }
}

class SalesData {
    int id;
    int amount;

    SalesData(int id, int price, int n) {
        this.id = id;
        this.amount = price * n;
    }
}

