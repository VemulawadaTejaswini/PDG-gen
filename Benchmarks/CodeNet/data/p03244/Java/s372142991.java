import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0; i<n; i++){
        int v = sc.nextInt();
        if(map.containsKey(v)) map.put(v,map.get(v)+1);
        else                   map.put(v,1);
      }
      if(map.size() == 1) {System.out.println(n/2);System.exit(0);}
      if(map.size() == 2) {System.out.println(0);System.exit(0);}
      //値で並び替え
         map.entrySet().stream()
        .sorted(java.util.Map.Entry.comparingByValue());
      //値だけをlistに入れ替える
      List<Integer> list = new ArrayList<>(map.values());
      int cnt=0;
      for(int i=0; i<list.size()-2; i++){
        cnt = cnt + list.get(i);
      }
      System.out.println(cnt);
	}
}