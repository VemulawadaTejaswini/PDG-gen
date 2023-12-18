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
    StringBuilder fo = new StringBuilder(fore);
    StringBuilder ba = new StringBuilder(back);
    if(flag==1){
      System.out.print(fo.reverse());
      System.out.print(s);
      System.out.println(back);
    }
    else{
      System.out.print(ba.reverse());
      System.out.print(s);
      System.out.println(fore);
    }
  }
}
