import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<int[]> Mdata = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            int[] data = new int[3];
            data[0] = scanner.nextInt();
            data[1] = scanner.nextInt();
            data[2] = scanner.nextInt();
            Mdata.add(data);
        }
        scanner.close();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] data : Mdata) {
            int L = 0;
            int R = 0;
            if (map.containsKey(data[0]) && map.containsKey(data[1])) {
                if (data[2] == (map.get(data[1]) - map.get(data[0]))) {
                    continue;
                } else {
                    System.out.println("No");
                    return;
                }
            }
            if (map.containsKey(data[1])) {
                R = map.get(data[1]);
                L = (map.containsKey(data[0])) ? map.get(data[0]) : R - data[2];
            } else {
                L = (map.containsKey(data[0])) ? map.get(data[0]) : 0;
                R = data[2] + L;
            }
            map.put(data[0], L);
            map.put(data[1], R);
        }

        System.out.println("Yes");
    }
}
