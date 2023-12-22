import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int tH = sc.nextInt();
    int tA = sc.nextInt();
    int aH = sc.nextInt();
    int aA = sc.nextInt();
    
    do{
      aH = aH - tA;
      tH = tH - aA;
      
      break;
    } while(tH <=0 || aH <=0);
   
    if(tH <= 0){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }  
}