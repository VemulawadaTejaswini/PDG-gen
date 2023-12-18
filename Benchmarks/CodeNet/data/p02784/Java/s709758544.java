import java.util.*;

public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int hitPoint = sc.nextInt();
    int attackCount = sc.nextInt();
    
    int list[] = new int[attackCount];
    int damage = 0;
    for(int i =0; i < attackCount; ++i){
      list[i] = sc.nextInt();
      damage  += list[i];      
    }
    
    if(hitPoint <= damage){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }   
  }  
}