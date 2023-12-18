import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    char[] sp = s.toCharArray();
    char[] tp = t.toCharArray();
    Arrays.sort(sp);
    Arrays.sort(tp);
    int max;
    int flag=0;
    if(sp.length<tp.length){
      max=sp.length;
      flag=1;
    }else max=tp.length;
   
    int i;
    for(i=0;i<max;i++){
      if(sp[i]<tp[i]){
        System.out.println("Yes");
        break;
      }else continue;     
    }
    if(i==max&&flag==0) System.out.println("No");
    else if(i==max&&flag==1) System.out.println("Yes");
  }
}