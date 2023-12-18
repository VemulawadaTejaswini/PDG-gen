import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
 
    ArrayList<Integer> list = new ArrayList<Integer>();
    
    for(int i = A ; i < A+K && i <= B ; i++){
      list.add(i);
    }
    
    if(B-K > 0){
      for(int i = B ; i > B-K && i >= A; i--){
      if(K >= B){
        break;
      }
      list.add(i);
     }
    }
    
    
    Collections.sort(list);
    for(int i = 1 ; i < list.size() ; i++){
      if(list.get(i) == list.get(i-1)){
        list.remove(i);
      }
    }
    
    for(int i = 0 ; i < list.size() ; i++){
      
      System.out.println(list.get(i));
      
    }
    
  }
}