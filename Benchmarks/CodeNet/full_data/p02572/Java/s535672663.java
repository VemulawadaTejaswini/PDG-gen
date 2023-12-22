import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        long[] array = new long[num];
        long ret = 0;

        for (int i = 0; i < num; i++) {
            array[i] = Long.parseLong(lines[i]);
            for (int j = 0; j < i; j++) {
                ret += (array[i] * array[j]);
                if (ret >= 1000000007) {
                    ret = ret % 1000000007;
                }
            }
        }

        System.out.println(ret);
    }

}