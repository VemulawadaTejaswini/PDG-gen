import java.util.*;
import java.lang.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Long n = scanner.nextLong();
        Long k = scanner.nextLong();

        List<Long> listA = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            listA.add(scanner.nextLong());
        }

        if (k > n) {
            System.out.println(0);
            System.exit(0);
        }

        if ( k == 0) {
            Long[] array = listA.toArray(new Long[listA.size()]);
            Long sum = Stream.of(array).mapToLong(Long::longValue).sum();
            System.out.println(sum);
            System.exit(0);
        }

        Collections.sort(listA);
        for(int i = 0; i < k; i++){
            int num = listA.size()-1;
            listA.remove(num);
        }

        Long[] array = listA.toArray(new Long[listA.size()]);
        Long sum = Stream.of(array).mapToLong(Long::longValue).sum();
        System.out.println(sum);
    }
}
