import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = new Integer(temp[0]);
        int Q = new Integer(temp[1]);

        temp = scanner.nextLine().split(" ");
        List<Long> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(new Long(temp[i]));
        }
        Collections.sort(A);

        for (int i = 0; i < Q; i++) {
            List<Long> list = new ArrayList<>(A);

            long x = new Integer(scanner.nextLine());
            long count = 0;
            while (list.size() > 0) {
                count += list.get(list.size()-1);
                list.remove(list.size()-1);

                long min = 999999999;
                for (int j = 0; j < list.size(); j++) {
                    long abs = Math.abs(x - list.get(j));
                    if (abs > min) {
                        int index = list.indexOf(x-min);
                        if (index == -1) {
                            list.remove(j - 1);
                        } else {
                            list.remove(index);
                        }
                        break;
                    } else if (j == list.size()-1) {
                        min = abs;
                        int index = list.indexOf(x-min);
                        if (index == -1) {
                            list.remove(j);
                        } else {
                            list.remove(index);
                        }
                    }
                    min = abs;
                }
            }
            System.out.println(count);
        }
    }

}
