import java.util.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	       Scanner sc = new Scanner(System.in);
           int N = sc.nextInt();
		////////////入力/////////////////////////////////
		  //Listに入力///////////////////////////////////////
		  ArrayList<String> list = new ArrayList<String>();
		  for(int i =0;i<N;i++) {
			  String A = sc.next();
			  list.add(A);
		   }
      //System.out.println(list);
      		  //List内の要素の出現回数をカウント//////////////////////////////////////
			Map<String, Long> counts = list.stream()
				    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(counts.size());
    }
}