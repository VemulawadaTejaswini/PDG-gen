import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long h = sc.nextLong();
    long w = sc.nextLong();
    long he = h/2,ho=h/2,we= w/2,wo=w/2,ans=0l;
    if(h%2==1l){
      ho++;
    }
    if(w%2==1l){
      wo++;
    }
    ans = (we+wo)*(h/2l);
    if(h%2==1l){
      ans+=wo;
    }
    System.out.println(ans);

  }
}
