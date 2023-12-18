import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numList.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            List<Integer> tempList = new ArrayList<>(numList);
            tempList.remove(i);
            System.out.println(medium(tempList));
        }
    }

    private static int medium(List<Integer> list){
        Collections.sort(list);
        return list.get((list.size() + 1) / 2 - 1);
    }
}
