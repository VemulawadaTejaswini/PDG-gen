import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String strn=sc.next();
    String strnarr[]=strn.split("");
    int sum=0;
    for(int i=0;i<strn.length();i++){
      sum+=Integer.parseInt(strnarr[i]);
    }
    if(sum%9==0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}