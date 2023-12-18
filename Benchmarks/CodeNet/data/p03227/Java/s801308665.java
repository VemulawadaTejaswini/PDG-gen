import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String S=scan.nextLine();
    if(S.length()==3){
      StringBuffer s=new StringBuffer(S);
      System.out.println(s.reverse().toString());
    }
    else if(S.length()==2){
      System.out.println(S);
    }
  }
}