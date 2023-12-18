import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer,Integer> red = new HashMap<Integer,Integer>();
      Map<Integer,Integer> blue = new HashMap<Integer,Integer>();
      for(int i = 0;i < n;i++)red.put(sc.nextInt(),sc.nextInt());
      for(int i = 0;i < n;i++)blue.put(sc.nextInt(),sc.nextInt());
      Object[] blueKey = blue.keySet().toArray();
      Arrays.sort(blueKey);
      int cnt = 0;
      boolean[] used = new boolean[n*2+1];
      for(Integer b : blue.keySet()){
        int max = -1;
        int z = 0;
      	for(Integer a : red.keySet()){
        	if(b>a&&blue.get(b)>red.get(a)&&!used[a]){
            	max = Math.max(max,red.get(a));
              if(max==red.get(a))z=a;
            }
        }
        if(max>=0){
          cnt++;
          used[z]=true;
        }
      }
      System.out.println(cnt);
    }
}
