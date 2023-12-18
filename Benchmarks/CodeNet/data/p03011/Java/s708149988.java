import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            list.add(scan.nextInt());
        }
        
        Integer[] result = (Integer[]) list.stream().sorted().toArray();

        System.out.println(result[0] + result[1]);

        scan.close();
    }
}