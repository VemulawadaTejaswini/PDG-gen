import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long r = 0;
    for(String t:sc.next().replaceAll("BC","D").split("[BC]+")){
      long cnt = 0;
      for(int i=t.length()-1;i>=0;i--){
        if(t.charAt(i)=='D')cnt++;
        else r+=cnt;
      }
    }
    System.out.println(r);
  }
}