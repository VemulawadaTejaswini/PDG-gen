import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Map<Integer,Integer> a = new HashMap<Integer,Integer>();
    for(int i = 0; i < n; i++){
      int in = sc.nextInt();
      if(a.containsKey(in)){
        int temp = a.get(in) + 1;
        a.put(in,temp);
      }
      else{
        a.put(in,1);
      }
      }
      if(a.size() > k){
        List<Integer> count = new ArrayList<Integer>();
        for(int i:a.keySet()){
          int temp = a.get(i);
          count.add(temp);
        }
        Collections.sort(count);
        int ans = 0;
        int j = 0;
        for(int i = a.size(); i > k; i--){
          ans += count.get(j);
          j++;
        }
        System.out.println(ans);
      }
      else{
        System.out.println(0);
      }
    }
  }