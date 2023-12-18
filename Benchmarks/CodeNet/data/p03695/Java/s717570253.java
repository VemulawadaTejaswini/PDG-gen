import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for(int i = 0 ; i < datanum;i++)
            ls.add(sc.nextInt());
        Map<Rate,List<Integer>> mp = ls.parallelStream().collect(Collectors.groupingBy(e -> col.apply(e)));
        int min,max;
        min = mp.size();
        max = mp.size();
        if(mp.containsKey(Rate.free)) {
            min -= 1;
            max += mp.get(Rate.free).size() - 1;
        }
        System.out.println(min + " " + max);
    }

    static Function<Integer,Rate> col = r -> {
        if(r < 400)
            return Rate.gray;
        else if(r < 800)
            return Rate.blown;
        else if(r < 1200)
            return Rate.green;
        else if(r < 1600)
            return Rate.lightblue;
        else if(r < 2000)
            return Rate.blue;
        else if(r < 2400)
            return Rate.yellow;
        else if(r < 2800)
            return Rate.orange;
        else if(r < 3200)
            return Rate.red;
        else
            return Rate.free;
    };
}
enum Rate
{
    gray,blown,green,lightblue,blue,yellow,orange,red,free;
}
