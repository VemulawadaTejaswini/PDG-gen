import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();

    int i=1;
    int ans;

    while(true){
      if(n/(int)Math.pow(k,i-1)==0){
        ans = i-1;
        break;
      }

      i++;
    }

    System.out.println(ans);
  }
}