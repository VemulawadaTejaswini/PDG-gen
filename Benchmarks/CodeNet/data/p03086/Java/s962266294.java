import java.util.*;
import java.util.ArrayList;

public class Main{ 
  
  public static void main(String[] args) throws Exception{
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    
    char[] list = S.toCharArray();
    
    int count = 1;
    ArrayList<Integer> countAll = new ArrayList<Integer>();
    countAll.add(0);
    for(int i = 1; i < list.length; ++i){
      if((list[i-1] =='A' || list[i-1] =='C' ||list[i-1] =='G' ||list[i-1] =='T')
        &&(list[i] == 'A' || list[i] == 'C' || list[i] == 'G' || list[i] == 'T')){
        count++;
      }else{
        countAll.add(count);       
      }
    }
    
    for(int i = 1; i < countAll.size(); ++i){
      
      if(countAll.size() == 1){
        System.out.println(count);
        return;
      }else{
      int a = countAll.get(i-1);
      int b = countAll.get(i);
     
      if(a >= b){
         count = a;
      }
      }
    }
    
    if(count == 1){
      System.out.println(0);
    }else{
     System.out.println(count);
    }
    
  }
} 
