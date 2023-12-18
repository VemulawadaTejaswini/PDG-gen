import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> demandList = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            demandList.add(sc.nextInt());
        }
        Collections.sort(demandList);

        int sum = 0;
        int childCount = 0;
        for (int demand : demandList) {
            if (sum+demand > x) {
                break;
            }
            sum += demand;
            childCount++;
        }
        if (sum != x && childCount != 0) {
            childCount--;
        }

        System.out.println(childCount);

    }
}