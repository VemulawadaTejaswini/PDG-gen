import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.next());
      List<Integer> p = new ArrayList<Integer>();
      List<Integer> P = new ArrayList<Integer>();
      int i;
      int count = 0;
      int m;
      for(i=0;i<n;i++){
        p.add(Integer.parseInt(sc.next()));
        m = p.get(i);
        Collections.sort(p);   
        if(p.get(0)==m){
          count++;
        }
      }
      System.out.println(count);     
    }
}
