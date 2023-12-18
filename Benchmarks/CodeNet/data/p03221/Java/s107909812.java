import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] temp = scanner.nextLine().split(" ");
        int N = Integer.valueOf(temp[0]);
        int M = Integer.valueOf(temp[1]);

        int[] P = new int[M];
        int[] Y = new int[M];

        List<List<Integer>> prefList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            prefList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            temp = scanner.nextLine().split(" ");
            P[i] = Integer.valueOf(temp[0]);
            Y[i] = Integer.valueOf(temp[1]);

            List<Integer> list = prefList.get(P[i]-1);
            list.add(Y[i]);
        }
        for (List<Integer> list: prefList) {
            Collections.sort(list);
        }

        for (int i = 0; i < M; i++) {
            List<Integer> list = prefList.get(P[i]-1);
            int index = list.indexOf(Y[i]);
            System.out.println(padLeft(P[i]) + padLeft(index+1));
        }
    }

    public static String padLeft(int i) {
        return String.format("%06d", i);
    }

}