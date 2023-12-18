import java.util.*;

public class Main {               
    
  public static void main(String[] args) {     
     
      Scanner sc = new Scanner(System.in);                                                                                    
                                               
      int N = sc.nextInt();
      
      int a[] = new int[N];
      int b[] = new int[N];
      
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      
      for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();      
            map.put(a[i],b[i]);
      }
      
      map.put(1,(int)Math.pow(10,9));
      
      Arrays.sort(a);
      
      int amin = a[0];
      int amax = a[a.length - 1];
            
      int base = amax - amin + 1;
      
      int bmin = map.get(amax);
      int bmax = map.get(amin);      
      
      int max_value = (int) Math.pow(10,9);
      int min_value = 0;      
     
      int bstart = 0;
      int astart = 1;
      
      int bminside_plus = bmin - bstart;      
      int bmaxside_plus = Math.min(max_value - bmax,amin - astart);
      
      System.out.println(bminside_plus + base + bmaxside_plus);
      
      
      
  }          
}
        
        