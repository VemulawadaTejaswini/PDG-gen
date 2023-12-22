import java.util.*;
// import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder sb = new StringBuilder();

        int num_a = sc.nextInt();

        ArrayList<Integer> array_a = new ArrayList<>();
        for (int i = 0; i < num_a; i++) {
            int tmp = sc.nextInt();
            array_a.add(tmp);
        }

        int num_b = sc.nextInt();

        ArrayList<Integer> array_b = new ArrayList<>();
        for (int i = 0; i < num_b; i++) {
            int tmp = sc.nextInt();
            array_b.add(tmp);
        }

        for (int i = 0; i < array_a.size() && i < array_b.size(); i++) {
            if (array_a.get(i) > array_b.get(i)) {
                System.out.println(0);
                sc.close();
                return;
            } else if (array_a.get(i) < array_b.get(i)) {
                System.out.println(1);
                sc.close();
                return;
            }
        }

        if (array_a.size() >= array_b.size()) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        // System.out.print(sb);
        
        sc.close();
    }
}

