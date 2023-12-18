import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean isOK=false;
    sc.close();
    while(s!=null){
      cut(s);
      if(s="wrong"){
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
    return;
  }
  public static String cut(String str){
    if(str.length()>=5){
      if(str.substring(str.length()-5,str.length()).equals("dream")||str.substring(str.length()-5,str.length()).equals("erase")){
        str=str.substring(0, str.length()-5);
        return str;
      }
    }
    if(str.length()>=6){
      if(str.substring(str.length()-6,str.length()).equals("eraser")){
        str=str.substring(0, str.length()-6);
        return str;
      }
    }
    if(str.length()>=7){
      if(str.substring(str.length()-6,str.length()).equals("dreamer")){
        str=str.substring(0, str.length()-7);
        return str;
      }
    }
    return "wrong";
  }
}