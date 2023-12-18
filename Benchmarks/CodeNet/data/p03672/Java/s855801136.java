import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String tmp="";
    for(int i=1;i<S.length();i++){
      tmp=S.substring(0,S.length()-2*i);
      if(isEvenstr(tmp)){
        System.out.println(tmp.length());
        return;
      }
    }
    
  }
  public static boolean isEvenstr(String tmp){
    if(tmp.substring(0,tmp.length()/2).equals(tmp.substring(tmp.length()/2,tmp.length()))){
      return true;
    }
    return false;
  }
       
                                              
  

  
}