import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = n%10;
    
    if(ans==2 || ans==4 || ans==5 || ans==7 || ans==9){
      System.out.println("hon");
    }else if(ans==0 || ans==1 || ans==6 || ans==8){
      System.out.println("pon");
    }else{
      System.out.println("bon");
    }
    
  }  
}