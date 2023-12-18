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
    numList.sort(naturalOrder());
    long res = 0;
    for(int i=0;i<N;i++){
        int n = i;
        long count = numList.stream().filter(s->s == n).count();
        if(i - count < 0){
            res += count - i;
        }else if(i - count > 0){
            res += count;
        }
    }
    System.out.println(res);
  }
}