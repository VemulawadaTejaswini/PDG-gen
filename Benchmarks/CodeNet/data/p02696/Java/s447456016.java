import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    long aa = Long.parseLong(a);
    String b = sc.next();
    long bb = Long.parseLong(b);
    String n = sc.next();
    long nn = Long.parseLong(n);
    long ans = 0;
    for(long i = 1/nn + 1; i <= nn; i++){
     	long temp = (aa*i)/bb - aa*(i/bb);
      	if(temp > ans) ans = temp;
    }
    System.out.println(ans);
  }
}