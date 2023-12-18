import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    List<String> list = Arrays.asList(str.split(""));
    sc.close();
    
    if(list.size() <= 1)
    {
      System.out.println("-1 -1");
      return;
    }
    
    Set<String> set = new HashSet<String>(list);
    Map<String,Long> map = new HashMap<String,Long>(set.size());
    
    long max = 0;
    String max_s = "";
    long max2 = -1;
    for(String s : set)
    {
      map.put(s,new Long(0));
    }
    for(String s:list)
    {
      long val = map.get(s) + 1;
      map.put(s,val);
      if(val > max)
      {
        max2 = max;
        max_s = s;
        max = val;
      }
      else if(val == max)
      {
        max2 = val;
      }
    }
    if(max2 != max && max >= (str.length() - max))
      System.out.println((str.indexOf(max_s) + 1) + " " + (str.lastIndexOf(max_s) + 1));
    else
      System.out.println("-1 -1");
    
    
  }
}