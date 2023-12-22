import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int[] l = Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf)
                                                .toArray();
        System.out.println(l[0] * l[1] + " " + (l[0] * 2 + l[1] *2));
    }
}
