import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    StringBuffer sb = new StringBuffer(S);
    int Q = Integer.parseInt(sc.next());
    int T, F;
    String C;
    for(int i=0; i<Q; i++){
      T = Integer.parseInt(sc.next());
      if(T==1){
        sb.reverse();
      } else if(T==2){
        F = Integer.parseInt(sc.next());
        C = sc.next();
        if(F==1){
          sb.insert(0,C);
        } else if(F==2){
          sb.append(C);
        }
      }
    }
    System.out.println(sb);
  }
}