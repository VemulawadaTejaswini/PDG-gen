import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    s=s.replaceAll("3","");
    s=s.replaceAll("6","");
    s=s.replaceAll("9","");
    long ans=0;
    for(int i=0;i<s.length();i++){
      char x=s.charAt(i);
      String y=String.valueOf(x);
      int a=Integer.parseInt(y);
      ans+=a;
    }
    if(ans%9==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}