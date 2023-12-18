import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int c1 = 0,c2 = 0;
    String s = sc.next();
    int count=0;
    boolean ac = false;
    for(int l = 0;l < n2;l++){
      c1 = sc.nextInt();
      c2 = sc.nextInt();
      for(int i = c1-1;i < c2;i++){
        if(s.charAt(i)=='A')ac=true;
        else if(s.charAt(i)=='C'&&ac){
          count++;
          ac=false;
        }else ac=false;
      }
      System.out.println(count);
      count = 0;
    }
  }
}