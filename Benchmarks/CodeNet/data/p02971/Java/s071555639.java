import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int index = 0; index < n; index++) {
          list.add(scanner.nextInt());
        }
        for(int index = 0;index < n; index++) {
          Integer removedInteger = Integer.valueOf(list.get(index));
          list.set(index, -99999);
          System.out.println(Collections.max(list));
          list.set(index, removedInteger);
        }
}
}