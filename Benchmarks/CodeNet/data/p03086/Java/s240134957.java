import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    char list[] = s.toCharArray();
    
    int count = 0;
    int index = 0;
    
    
    for(int i = 0; i < list.length; ++i){
      char com = list[i];
      if(com == 'A' || com == 'T'|| com == 'G'|| com == 'C'){
        index = i;
        count++;
        break;
      }    
    }
    
    int out = 0;
    for(int i = index+1; i < list.length; ++i){
      char con = list[i];
      if(con == 'A' || con == 'T'|| con == 'G'|| con == 'C'){
        count++;
      }else{
        out = i;
        break;
      }
    }
    
   
      System.out.println(count);
    
  }
  
}