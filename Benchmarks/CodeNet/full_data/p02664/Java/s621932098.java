import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    String T=s.next();
    String S="";
    for(int i=0;i<T.length();i++){
      if(T.charAt(i)=='?') S+="D";
      else S+=T.charAt(i);
    }
    
    System.out.println(S);
  }  
}