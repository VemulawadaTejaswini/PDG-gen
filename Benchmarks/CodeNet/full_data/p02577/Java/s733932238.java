import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    String N=s.next();
    int box=0;
    int max=N.length();
    for(int i=0;i<max;i++){
      box+=N.charAt(i)-48;
    }
    System.out.println(box%9==0?"Yes":"No");
    
  }  
}