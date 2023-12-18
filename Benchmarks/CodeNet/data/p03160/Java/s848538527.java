//package oct30;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner io = new Scanner(System.in);

    public static void main(String[] args) {

        int N = io.nextInt();
        io.nextLine();
//        System.out.println("N: " + N);

        ArrayList<Integer> stones = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            stones.add(io.nextInt());
        }
        ArrayList<Integer> min = new ArrayList<>();
        min.add(0);
        min.add(Math.abs(stones.get(0) - stones.get(1)));

        for (int i = 2; i < N; i++) {
            int one = Math.abs(stones.get(i) - stones.get(i-1))+min.get(i-1);
            int two = Math.abs(stones.get(i) - stones.get(i-2))+min.get(i-2);
            min.add(Math.min(one, two));
//            System.out.print("array so far: ");
//            for (int j : min) System.out.print(j + " ");
//            System.out.println();
        }
        System.out.println(min.get(N-1));

    }
}
