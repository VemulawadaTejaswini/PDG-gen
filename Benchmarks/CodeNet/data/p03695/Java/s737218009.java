import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < datanum; i++)
            ls.add(sc.nextInt());
        List<Integer> ls2 = ls.parallelStream().map(e -> (int) Math.floor(e / 400.0)).collect(Collectors.toList());
        long t = ls2.stream().filter(e -> e < 8).distinct().count();
        long f = ls2.stream().filter(e -> e >= 8).count();
        if (f <= 0)
            System.out.println(t + " " + t);
        else
            System.out.println(t + " " + (t + f));
    }
}