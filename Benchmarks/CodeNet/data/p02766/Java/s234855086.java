import java.util.*;

public class Main{

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int t=0;

    while(true){

      if (Math.pow(k,t)>n){
        System.out.println(t);
        break;
      }else
      t++;
    }
  }
}
