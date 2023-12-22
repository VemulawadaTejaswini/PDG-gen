import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<num; i++){
            list.add(sc.nextInt());
        }

        Optional<Integer> maxnum = list.stream().max(Comparator.naturalOrder());
        Optional<Integer> minnum = list.stream().min(Comparator.naturalOrder());
        int sumnum = list.stream().mapToInt(Integer::intValue).sum();

        minnum.ifPresent(n -> System.out.print(n + " "));
        maxnum.ifPresent(n -> System.out.print(n + " "));
        System.out.println(sumnum);
    }
}

