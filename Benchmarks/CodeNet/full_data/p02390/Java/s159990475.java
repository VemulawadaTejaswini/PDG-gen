import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] input = readInput();
        System.out.println(watch(input[0]));
    }

    public static String watch(int sec) {
        int s = sec % 60;
        sec /= 60;
        int m = sec % 60;
        int h = sec / 60;
        
        StringBuilder t = new StringBuilder();
        t.append(h).append(":").append(m).append(":").append(s);
        return t.toString();
    }


    public static Integer[] readInput() {
        List<Integer> l = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            l.add(sc.nextInt());
        }
        return l.toArray(new Integer[l.size()]);
    }
}