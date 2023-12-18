import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Map<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i = 1;i <= n;i++)map.put(sc.nextInt(),i);
      Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        int cnt = map.size();
        for (Integer nKey : map.keySet())
        {
            System.out.print(map.get(nKey));
            cnt--;
          if(cnt!=0)System.out.print(" ");
        }
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}
