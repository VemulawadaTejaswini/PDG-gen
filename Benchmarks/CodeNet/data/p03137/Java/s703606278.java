import java.util.*;
import java.util.Map.Entry;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] X = new int[M];
      boolean[] puted = new boolean[M];
      for(int i=0;i<M;i++){
        X[i] = sc.nextInt();
        puted[i] = false;
      }
      
      Arrays.sort(X);
      Map<Integer, Integer> map = new HashMap<>();

      for(int i=1;i<M;i++){
        map.put(i,X[i]-X[i-1]);
      }
      
      List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
      Collections.sort(list_entries, new Comparator<Map.Entry>() {
        @Override
        public int compare(Entry entry1, Entry entry2) {
          return ((Integer) entry2.getValue()).compareTo((Integer) entry1.getValue());
        }
      });
      
      int total = X[M-1] - X[0];
      int n = N;
      for (Entry<Integer, Integer>  s : list_entries) {
        int x = s.getKey();
        if(n > 1){
          
          
          total -= (Integer)s.getValue();
          if(!puted[x]){
            
            puted[x] = true;
            n -= 1;
          }
          if(!puted[x-1]){
            puted[x-1] = true;
            n -= 1;
          }
          
        } else {
          if(x == M-1){
            total -= (Integer)s.getValue();
            n -= 1;
          } else if(x == 1){
            total -= (Integer)s.getValue();
            n -= 1;
          } else if(puted[x-1]){
            total -= (Integer)s.getValue();
            n -= 1;
          } 
        }
        
        if(n == 0){
          System.out.println(total);
          break;
        }      
	}
    }
}