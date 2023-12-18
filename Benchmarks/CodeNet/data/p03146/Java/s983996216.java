import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int answer = 1;
    boolean isFour = false;
    if(s==1){
      System.out.println(4);
    }else if(s==2){
      System.out.println(4);
    }else if(s==4){
      System.out.println(4);
    }else{
      while(1==1){
        if(s%2==0){
          s=s/2;
        }else{
          s=3*s+1;
        }
        answer = answer +1;
        if(s==4){
          if(!isFour){
            isFour=true;
          }else{
            break;
          }
        }
      }
      System.out.println(answer);
    }
        
        
      
      
  }
  

  
}