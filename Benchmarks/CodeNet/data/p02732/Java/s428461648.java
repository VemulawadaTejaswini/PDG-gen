import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
   	int n = sc.nextInt();
    int as[] = new int[n+1];
    int as2[] = new int[n+1];
    Map nMap = new HashMap<Integer,Integer>();
    List nList = new ArrayList<Integer>();
    int count = 0;
    int ap = 0;
    int istack;
    int cnt;
    
    for(int i = 0;i < n;i++) {
      as[i] = sc.nextInt();
      as2[i] = as[i];
    }
    as2[n] = n + 1;
    Arrays.sort(as2);
    istack = as2[0];
    cnt = 1;
    for(int i = 1;i <= n;i++){
      if(istack == as2[i]) cnt++;
      else{
        ap += cnt*(cnt-1);
        nMap.put(istack,cnt-1);
        istack = as2[i];
        cnt = 1;
      }
    }
    ap /= 2;
    
    for(int i = 0;i < n;i++){
      System.out.println(ap - (int)nMap.get(as[i]));
    }
    
    

  }
}
