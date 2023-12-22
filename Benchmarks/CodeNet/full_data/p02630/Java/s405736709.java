
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> nList = new ArrayList<>();
        for (int i = 0 ; i <N ; i++){
            nList.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q ; i++) {
            int B = scanner.nextInt();
            int C = scanner.nextInt();
            int sum = 0;
            for (int j = 0 ; j < nList.size() ; j++) {
                if (nList.get(j) == B) {
                    nList.set(j, C);
                }
            }
            for (Integer info : nList) {
                sum = sum + info;
            }
            System.out.println(sum);
        }
    }
}
