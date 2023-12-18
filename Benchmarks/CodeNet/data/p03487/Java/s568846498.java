import java.util.*;
import java.util.stream.*;
import static java.util.Comparator.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
    List<Integer> numList = new ArrayList<>();
    while(sc.hasNextInt()){
        numList.add(sc.nextInt());
    }
    List<Integer> X = numList.stream().parallel().distinct().sorted().collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
    long res = 0;
    for(int x : X){
        long count = numList.stream().parallel().filter(s->s == x).count();
        if(x - count < 0){
            res += count - x;
        }else if(x - count > 0){
            res += count;
        }
    }
    System.out.println(res);
  }
}
