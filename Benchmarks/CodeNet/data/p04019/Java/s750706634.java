
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    boolean isN=false;
    boolean isS=false;
    boolean isE=false;
    boolean isW=false;
    String tmp;
    for(int i=0;i<S.length();i++){
      tmp=S.substring(i,i+1);
      if(tmp.equals("N")){
        isN=true;
      }else if(tmp.equals("S")){
        isS=true;
      }else if(tmp.equals("E")){
        isE=true;
      }else{
        isW=true;
      }
    }
    if((isN&&!isS)||(isE&&!isW)||(!isN&&isS)||(!isE&&isW)){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }

    






  }
  

  
}
