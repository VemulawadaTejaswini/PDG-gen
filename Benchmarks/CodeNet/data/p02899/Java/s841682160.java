
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

        String str = new String();
        for(int i=1; i <= x; i++) {
            str += scanner.next();
        }
        String res = "";
        for(int i = 1; i <= x; i++) {
            res += str.indexOf(String.valueOf(i)) + 1 + " ";
        }

        System.out.println(res.trim());
    }
}