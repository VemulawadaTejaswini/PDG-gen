import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> ls = new ArrayList<Integer>();
        int num = sc.nextInt();
        int cost = sc.nextInt();
        for(int i = 0; i < num; i++){
            ls.add(sc.nextInt());
        }
        ls.sort(Comparator.nullsFirst(Comparator.naturalOrder()));

        int sum = 0;
        int count = 0;
        for(int i = 0; i < num; i++){
            cost -= ls.get(i);
            count++;
            if(cost <= 0)
                break;
        }
        if(cost != 0)
            count--;
        System.out.println(count);
    }
}