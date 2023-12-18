import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
      for(int i=0; i<n/2; i++){
        int v = sc.nextInt();
        if(map.containsKey(v)) map.put(v,map.get(v)+1);
        else                   map.put(v,1);
        v = sc.nextInt();
        if(map2.containsKey(v)) map2.put(v,map2.get(v)+1);
        else                   map2.put(v,1);
      }
      List<Integer> list = new ArrayList<>(map.values());
      List<Integer> list2 = new ArrayList<>(map2.values());
      if(list.size() == list2.size()){
        if(list.get(0) == list2.get(0)) System.out.println(n/2);
        else System.out.println(0);
      }else{
        Collections.sort(list);
        Collections.sort(list2);
      int cnt=0;
      for(int i=0; i<list.size()-1; i++){
        cnt = cnt + list.get(i);
      }
      for(int i=0; i<list2.size()-1; i++){
        cnt = cnt + list2.get(i);
      }
      System.out.println(cnt);
      }
	}
}