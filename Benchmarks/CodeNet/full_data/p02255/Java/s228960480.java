import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] ns = new Integer[n];
        Stream.of(sc.nextLine().split(" "))
              .map(Integer::parseInt)
              .collect(Collectors.toList())
              .toArray(ns);
        System.out.println(Arrays.stream(ns)
                                 .map(Object::toString)
                                 .collect(Collectors.joining(" ")));
        for (int i = 1; i < ns.length; i++) {
            int v = ns[i];
            int j = i - 1;
            while (j >=0 && ns[j] > v) {
                System.out.println(ns[j] + " " + v);
                ns[j+1] = ns[j];
                j--;
            }
            ns[j+1] = v;
            System.out.println(Arrays.stream(ns)
                                     .map(Object::toString)
                                     .collect(Collectors.joining(" ")));
        }
    }
}

