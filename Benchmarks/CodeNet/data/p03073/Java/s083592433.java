import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String S=s.next();
    int r=0;
    char b=S.charAt(0);
    for(int i=1;i<S.length();i++){
      if(S.charAt(i)==b){
        r++;
        b=(S.charAt(i)=='0'?'1':'0');
      }
      else b=S.charAt(i);
    }
    System.out.println(r);
  }
}
