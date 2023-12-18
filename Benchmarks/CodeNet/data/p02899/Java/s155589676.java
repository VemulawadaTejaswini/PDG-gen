import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer x = Integer.parseInt(scanner.next());

        int[] a = new int[x];
        for(int i=0; i < x; i++) {
            a[Integer.parseInt(scanner.next()) - 1] = i;
        }

        String res = "";
        for(int i = 0; i < x; i++) {
            res += a[i]+1 + " ";
        }
        System.out.println(res.trim());
    }
}