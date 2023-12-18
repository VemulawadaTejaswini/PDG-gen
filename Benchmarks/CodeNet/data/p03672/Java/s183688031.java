import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	String s=sc.next();
    int n=s.length();
    for(int i=0;i<s.length();i+=2){
      String a=s.substring(0,2/n),b=s.substring(2/n,n);
      if(a.equals(b)){
        Systen.out.println(n);
        break;
      }
      s=s.substring(0,n-2);
      n=s.length();
    }
  }
}
