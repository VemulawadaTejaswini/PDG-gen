import java.util.*;
import java.util.stream.*;
public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<Integer> p = new ArrayList<>();
    for(int i = 0; i<n; i++){
      p.add(sc.nextInt());
    }
    Collections.sort(p);
    p = p.subList(0,k);
 		// 出力
    String ans = p.stream().reduce(0,Integer::sum).toString();
    System.out.println(ans);
	}
}