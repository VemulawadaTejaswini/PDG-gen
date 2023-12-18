import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int n=s.length();
    int flag=0;
    for(int i=0;i<n;++i){
      flag+=s.charAt(i)=='o'?1:0;
    }
    System.out.print(15+flag-n>=8?"YES":"NO");
  }
}