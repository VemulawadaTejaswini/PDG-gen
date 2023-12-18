import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> results = new ArrayList<>();
        for(int i = 0; i < n; ++i) {
            integers.add(scanner.nextInt());
        }

//        for(Integer i : integers) {
//            System.out.println(i);
//        }


        for(int i = 1; i < n-1; ++ i) {
            Collections.sort(integers);
            int num1 = integers.get(0);
            int num2 = integers.get(1);
            integers.add(num1 - num2);
            results.add(num1);
            results.add(num2);
            integers.remove(0);
            integers.remove(0);
        }

        Collections.sort(integers);
        System.out.println(integers.get(1) - integers.get(0));
        results.add(integers.get(1));
        results.add(integers.get(0));

//        for(Integer i : integers) {
//            System.out.println(i);
//        }

        for(int i = 0; i < n; i += 2) {
            System.out.println(results.get(i) + " " + results.get(i+1));
        }
    }

}