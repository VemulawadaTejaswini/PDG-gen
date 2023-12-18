import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder s = new StringBuilder(sc.next());
    int q=sc.nextInt();
    int flag=1;
    int a=0,b=0;
    String c="";
    
    for(int i=0;i<q;i++){
      a=sc.nextInt();
      if(a==2){
      b=sc.nextInt();
      c=sc.next();
      if(b==1&&flag==1) s.insert(0,c);
      else if(b==1&&flag==-1) s.insert(s.length()-1,c);
      else if(b==2&&flag==1) s.insert(s.length()-1,c);
      else if(b==2&&flag==-1) s.insert(0,c);
      }
      if(a==1&&s.length()>1) flag*=-1;
    }
    if(flag==1) System.out.println(s);
    else{
      for(int i=s.length()-1;i>=0;i--) System.out.print(s.charAt(i));
    }
  }
}