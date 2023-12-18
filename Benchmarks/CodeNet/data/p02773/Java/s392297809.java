import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int max = 1;
      	HashMap<String,Integer> map = new HashMap<String,Integer>();
      	for(int i=0;i<a;i++){
          String s = sc.next();
          if( map.containsKey(s) ){
            map.put(s,map.get(s)+1);
            if( map.get(s) > max ){
              max = map.get(s);
            }
          }else{
            map.put(s,1);
          }
        }
      /*
      	for(String key : map.keySet() ){
          if( map.get(key) != max ){
            map.remove(key);
          }
        }
      */
      	Object[] mapkey = map.keySet().toArray();
      	Arrays.sort(mapkey);
      	for(String key : map.keySet()){
          if( map.get(key) == max )
          System.out.println(key);
        }
	}
}