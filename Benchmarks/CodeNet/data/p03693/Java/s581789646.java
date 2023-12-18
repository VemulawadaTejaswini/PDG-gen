import java.util.LinkedList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < datanum; i++)
            ls.add(sc.nextInt());
        for(Integer e : ls)
            e = (int) Math.floor(e / 400.0);
        long t = ls.stream().filter(e -> e < 8).distinct().count();
        long f = ls.stream().filter(e -> e >= 8).count();
        if (f <= 0)
            System.out.println(t + " " + t);
        else
            System.out.println(t + " " + (t + f));
    }
}