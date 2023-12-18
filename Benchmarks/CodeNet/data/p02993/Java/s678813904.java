import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    boolean flag = false;
    for(int i = 0; i<3; i++){
      if(s.charAt(i)==s.charAt(i+1)){
        flag = true;
      }
    }
    
    if(flag==true){
      System.out.println("bad");
    }else{
      System.out.println("good");
    }
  }
}