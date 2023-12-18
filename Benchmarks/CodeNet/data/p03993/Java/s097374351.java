import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int rabbit = sc.nextInt();
    int[] list = new int[rabbit];
    for(int i = 0; i < rabbit; ++i){
      list[i] = sc.nextInt();
    }
    
   int count = 0;
    
    for(int i = 0 ; i < rabbit; ++i){
      int love = list[i];
      
        if(list[love - 1] == (i + 1)){
          count++;
        }
    }
    
    System.out.println(count/2);
    
  }
}