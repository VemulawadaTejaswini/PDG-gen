import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      List<Integer> p = new ArrayList<Integer>();
      List<Integer> P = new ArrayList<Integer>();
      int i;
      for(i=0;i<n;i++){
        p.add(sc.nextInt());
      }
      int count = 0;
      for(i=0;i<n;i++){
        P.add(p.get(i));   
        Collections.sort(P);   
        if(P.get(0)==p.get(i)){
          count++;
        }
      }
      System.out.println(count);      
    }
}
