import java.util.*;
public class Main{
  public static void Main(String[] args){
     new Scanner sc =new Scanner(System.in);
    int ans=0;
    String str=sc.next();
    
    for(int i=0;i<str.length;i++){
     char a;
     a=str.charAt(i);
      switch (str){
        case '+':
          ans++;
          break;
        default:
          ans--;
          break;
      }
    }
    System.out.print.ln(ans);
  
  }
}