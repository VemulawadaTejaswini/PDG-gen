import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int c1 = 0,c2 = 0;
    String s = sc.next();
    int max = 0,count=0,len=s.length();
    boolean ac = false;
    for(int l = 0;l < n2;l++){
      c1 = sc.nextInt();
      c2 = sc.nextInt();
      for(int i = c1-1;i < c2;i++){
        switch(s.charAt(i)){
          case 'A':
            ac=true;
            break;
          case 'C':
            if(ac){
              count++;
              ac=false;
            }
            break;
          default:
            ac=false;
            break;
        }
      }
      System.out.println(count);
      count = 0;
    }
  }
}