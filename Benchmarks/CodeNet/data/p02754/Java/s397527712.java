import java.util.*;
import java.lang.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer ao = Integer.parseInt(scanner.next());
        Integer aka = Integer.parseInt(scanner.next());

        List<String> list = new ArrayList<>();
        for(int i =1; i <  n; i++) {
            for (int j = 0; j < i* ao; j++) {
                list.add("b");
            }

            for (int k = 0; k < i* aka; k++) {
                list.add("r");
            }
            if ( n < list.size()) {
                break;
            }
        }
        String[] array = list.toArray(new String[list.size()]);
        String str = list.stream().collect(Collectors.joining("")).substring(0,n);
        System.out.println(str);
    }
}