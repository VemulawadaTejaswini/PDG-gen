import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();

    int n = sc.nextInt();
 	for(int i=0;i<n;i++){
      String sval = sc.next();
      map.put(sval,map.getOrDefault(sval,0)+1);
    }
    
    int m = sc.nextInt();
    for(int j=0;j<m;j++){
      String sval = sc.next();
      map.put(sval,map.getOrDefault(sval,0)-1);
    }
    
    map = map.entrySet().stream()
				.sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
				.collect(Collectors.
						toMap(Map.Entry::getKey,Map.Entry::getValue,(val, sval)->val,LinkedHashMap::new));
    
    System.out.println(Math.max(map.values().stream().findFirst().get(), 0));
    
  }
}