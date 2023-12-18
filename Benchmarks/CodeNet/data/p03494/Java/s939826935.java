import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int N = scanner.nextInt();
            int count = 0;
            boolean flg = true;
            List<Integer> numList = new ArrayList<>();
            scanner.nextLine();
            for (int i = 0; i < N; i++) {
                int j = scanner.nextInt();
                if (j % 2 == 1) {
                    flg = false;
                    break;
                }
                numList.add(j);
            }
            while (flg) {
                List<Integer> nextNumList = new ArrayList<>();
                for (Integer i : numList) {
                    if (i % 2 == 1) {
                        flg = false;
                        break;
                    }
                    nextNumList.add(i / 2);
                }
                if (!flg) {
                    break;
                }
                numList = nextNumList;
                count++;
            }
            System.out.println(count);
        }
    }
}
