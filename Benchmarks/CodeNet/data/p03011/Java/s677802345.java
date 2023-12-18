import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        List<Integer>  list = new ArrayList<>();

        for(int i=0; i<3; i++){
            num[i] = Integer.parseInt(sc.next());
        }

        list.add(num[0]+ num[1]);
        list.add(num[1] + num[2]);
        list.add(num[2] + num[0]);

        Collections.sort(list, (a,b)-> a-b);

        System.out.println(list.get(0));

    }
}