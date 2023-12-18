import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Long> a = new ArrayList<>();
        IntStream.range(0, N).forEach( b -> a.add(scan.nextLong()));
        LinkedList<Long> ret = new LinkedList<>();
        boolean flag = true;
        for (long data : a) {
            if(flag) {
                ret.addLast(data);
                flag = false;
            }
            else {
                ret.addFirst(data);
                flag = true;
            }
        }
        if(N % 2 == 0) {
            ret.forEach(x -> System.out.print(x + " "));
        }
        else {
            IntStream.range(0, N).forEach(i -> System.out.print(ret.get(N - 1 - i) + " "));
        }
    }
}