import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int datanum = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0; i < datanum; i++)
            ls.add(sc.nextInt());
        List<Rate> ls2 = ls.parallelStream().map(r -> {
            if (r < 400)
                return Rate.gray;
            else if (r < 800)
                return Rate.blown;
            else if (r < 1200)
                return Rate.green;
            else if (r < 1600)
                return Rate.lightblue;
            else if (r < 2000)
                return Rate.blue;
            else if (r < 2400)
                return Rate.yellow;
            else if (r < 2800)
                return Rate.orange;
            else if (r < 3200)
                return Rate.red;
            else
                return Rate.free;
        }).collect(Collectors.toList());
        int t = ls2.stream().distinct().collect(Collectors.toList()).size();
        if (!ls2.contains(Rate.free))
            System.out.println(t + " " + t);
        else {
            t -= 1;
            int f = (int) ls2.stream().filter(e -> e.equals(Rate.free)).count();
            System.out.println(t + " " + (t + f));
        }

    }

}
enum Rate
{
    gray,blown,green,lightblue,blue,yellow,orange,red,free;
}
