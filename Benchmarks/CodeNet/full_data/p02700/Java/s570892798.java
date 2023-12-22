import java.util.*;
 
public class Main{
  
  public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    int tH = sc.nextInt();
    int tA = sc.nextInt();
    int aH = sc.nextInt();
    int aA = sc.nextInt();
   
    int tCount =0;
    while(tH > 0){ 
     tH -= aA;
     tCount++;
    }
     
    int aCount =0;
    while(aH > 0){ 
      aH -= tA;
      aCount++;
    }
    
    if(tCount < aCount){
      System.out.println("No");
    }else if(tCount == aCount){
      System.out.println("Yes");
    }else{
       System.out.println("Yes");
    }
   
  }
  
}