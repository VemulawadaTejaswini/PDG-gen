import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.next());
    int q=sc.nextInt();
    int flag=1;
    int a=0,b=0;
    int ok=0;
    String c="",fore="",back="";
    
    for(int i=0;i<q;i++){
      a=sc.nextInt();
      if(a==2){
        ok=1;
      b=sc.nextInt();
      c=sc.next();
      if(b==1&&flag==1) fore+=c;
      else if(b==1&&flag==-1) back+=c;
      else if(b==2&&flag==1) back+=c;
      else if(b==2&&flag==-1) fore+=c;
      }
      if(a==1&&ok==1) flag*=-1;
    }
    if(flag==1){
      for(int i=fore.length()-1;i>=0;i--) System.out.print(fore.charAt(i));
      System.out.print(s);
      System.out.println(back);
    }
    else{
      for(int i=back.length()-1;i>=0;i--) System.out.print(back.charAt(i));
      System.out.print(s);
      System.out.println(fore);
    }
  }
}