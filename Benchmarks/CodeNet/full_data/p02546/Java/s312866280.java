import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String str=s.next();
    if(str.charAt(str.length()-1)=='s'){
      str+='es';
    }
    else
      str+='s';
    
    System.out.println(str);
  }
}