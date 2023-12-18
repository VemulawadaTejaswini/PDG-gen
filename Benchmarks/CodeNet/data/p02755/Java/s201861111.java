import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();

    long c = b*10;
    for (long j=c;j<c+10;j++){
      double gg = j*0.08;
      String t = gg+"";
      String p = a+"";
      if (t.charAt(0) == p.charAt(0)){
        System.out.println(j);
        return;
      }
    }
    System.out.println(-1);
  }
}
