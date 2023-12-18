import java.util.*;
import java.util.stream.Collectors;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int resNum = Integer.parseInt(sc.next());
		Map <String,List<Integer>> map = new TreeMap<>();
		List<Integer> out = new ArrayList<>();
      for(int x =1 ; x<=resNum; x++) {
        String a = sc.next();
        int b = Integer.parseInt(sc.next());
        if (map.containsKey(a)) {
          List<Integer> ls = map.get(a);
          ls.add(b);
          map.put(a, ls);
          out.add(b);
        } else {
          	List<Integer> ls = new ArrayList<>();
          ls.add(b);
         	map.put(a,ls);
         	out.add(b);
        }
      }
      // キーでソートする
      //Object[] mapkey = map.keySet().toArray();
      //Arrays.sort(mapkey);

      List<Integer> list = new ArrayList<>();
      for (String nKey : map.keySet())
      {
    	  List<Integer> ls =map.get(nKey);
    	  Collections.sort(ls, Collections.reverseOrder());
    	  ls.forEach(a -> {list.add(a);});
      }
      loop:for (Integer i : list) {
    	  for (int x =0; x < list.size(); x++) {
    		  if (i==out.get(x)) {
    			  System.out.println(x+1);
                continue loop;
    		  }
    	  }
      }
    }
	}