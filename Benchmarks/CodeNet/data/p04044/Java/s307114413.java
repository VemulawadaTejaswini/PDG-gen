import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), l = in.nextInt(); in.nextLine();
        List<String> list = new ArrayList<>();
        for(int i = 0; i < l; i++) {
            list.add(in.nextLine());
        }
        Collections.sort(list);
        list.forEach(System.out::print);
    }
}