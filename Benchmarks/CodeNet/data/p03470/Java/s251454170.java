import java.util.*;
import java.util.stream.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < n; i++) {
    	list.add(sc.nextInt());
    }
    
    //重複を削除
    List<Integer> ans = list.stream().distinct().collect(Collectors.toList());
    
    System.out.println(ans.size());
  }
}
