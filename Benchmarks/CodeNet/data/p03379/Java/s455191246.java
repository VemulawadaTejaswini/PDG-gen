import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        List<Integer> input = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i) {
            input.add(sc.nextInt());
        }

        int mediaIndex = (size / 2) - 1;

        List<Integer> filtered = new ArrayList<Integer>();
        for (int i = 0; i < size; ++i) {
            filtered.clear();
            for (int j = 0; j < size; ++j) {
                if (i == j) continue;
                filtered.add(input.get(j));
            }
            Collections.sort(filtered);
            System.out.println(filtered.get(mediaIndex));
        }
    }
}