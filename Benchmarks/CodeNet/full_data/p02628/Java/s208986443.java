import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(list);
        int total = 0;
        for(int i=0; i<k; i++){
            total += list.get(i);
        }
        System.out.println(total);
    }
}