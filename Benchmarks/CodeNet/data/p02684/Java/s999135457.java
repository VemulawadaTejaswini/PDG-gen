import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args []) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();



        List<Integer> list= new ArrayList<>();

        for (int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }

        int x = list.get(0);

        for (int j = 1; j<k; j++) {
            x = list.get(x - 1);
        }

        System.out.println(String.valueOf(x));


    }
}
