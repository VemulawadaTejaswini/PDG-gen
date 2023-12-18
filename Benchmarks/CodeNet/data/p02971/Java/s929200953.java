import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        List<Long> listA = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            listA.add(scanner.nextLong());
        }

        for(int i = 0; i< listA.size(); i++) {
            ArrayList<Long> listB = new ArrayList<>(listA);
            listA.remove(i);
            Collections.sort(listA);
            System.out.println(listA.get(listA.size()-1));
            listA = new ArrayList<>(listB);
        }

    }
}
