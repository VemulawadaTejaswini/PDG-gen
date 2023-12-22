import java.util.*;
import java.util.Map;
import java.util.Arrays;
import static java.util.stream.Collectors.*;
import static java.util.function.Function.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      
      //重複はSetでいい
      List<String> numList = new ArrayList<>();
      for (int i=0; i<n; i++) {
          String di = sc.next();
          numList.add(di);
      }

      
      Map<String, Long> map = numList.stream().collect(groupingBy(identity(), counting()));
      List<String> List = Arrays.asList("AC","WA","TLE","RE");
      for(String num : List){
        Long value = map.get(num);
        if(value != null){
      		System.out.println(num + " x " + map.get(num));
        }else{
        	System.out.println(num + " x " + 0);
        }
      }
    }
}