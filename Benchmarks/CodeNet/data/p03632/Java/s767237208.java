import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
    int ans=Math.min(b,d)-Math.max(a,c);
    if(ans>0){
      System.out.println(ans);
    }else{
      System.out.println(0);
    }
  }
}