import java.util.*;
 
public class Main{
  public static void main(){
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    HashMap<Integer, ArrayList<Integer>> h = new HashMap<Integer,ArrayList<Integer>>();
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
      
    for(int i=0; i<M;i++)
    {
      int P = sc.nextInt();
      int Y = sc.nextInt();
      
      if(!h.containsKey(P))
      {
        h.put(P, new ArrayList<Integer>());
      }
      
      h.get(P).add(Y);
      hm.put(Y, i);
    }
    
    for(int key:h.keySet())
    {
      Collections.sort(h.keySet());
    }
    
    String[] ans = new String[M];
    
    for(int key:h.keySet())
    {
      String first = key+"";
      for(int i=0; i < 6-(key+"").length() ;i++)
      {
        first = "0" + first;
      }
      
      for(int i=0; i < h.get(key).size();i++)
      {
		int ind = hm.get(h.get(key).get(i));
        String second = (i+1)+"";
        
        for(int j=0;j < 6-((i-1)+"").size(); j++)
        {
          second = "0" + second;
        }
        
        ans[ind] = first+second;
      }
    }
 
    for(String an:ans)
    {
      System.out.println(an);
    }
  }
} 