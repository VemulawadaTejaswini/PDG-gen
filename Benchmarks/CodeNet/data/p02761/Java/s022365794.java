
import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer a = Integer.parseInt(scanner.next());
        Integer b = Integer.parseInt(scanner.next());

        Map<Integer, Integer> map = new TreeMap<>();
        for(int i=0; i < b; i++) {
            map.put(Integer.parseInt(scanner.next()), Integer.parseInt(scanner.next()));
        }

        if (a == 1 && b == 0) {
            map.put(1, 0);
        }else if (b == 0){
            map.put(1, 1);
        }

        String result = new String();
        for(int i =1; i <= a; i++) {
            if(map.get(i) != null) {
                result += map.get(i);
            } else {
                result += "0";
            }
        }

        Integer result_i = Integer.parseInt(result);

        if( String.valueOf(result_i).length() != a) {
            System.out.println(-1);
            System.exit(0);
        }

        System.out.println(result_i);
    }
}
