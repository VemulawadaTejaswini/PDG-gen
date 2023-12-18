import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        for(int i=0;i<N;i++){X.add(sc.nextInt());}
        System.out.println(IntStream.rangeClosed(0, 100).map(p->
                X.stream().map(
                        x->(x-p)*(x-p)
                ).collect(Collectors.summingInt(Integer::intValue))
        ).min().getAsInt());
    }

}
