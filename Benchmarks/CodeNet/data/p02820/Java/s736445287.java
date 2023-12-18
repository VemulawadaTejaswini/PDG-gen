import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int k = sc.nextInt();

      int r = sc.nextInt();
      int s = sc.nextInt();
      int p = sc.nextInt();

      String t  =sc.next();

      int sum = 0;

      for (int i = 0;i<n;i++ ) {
        if (t.charAt(i)=='r') {
          sum +=p;
        }
        if (t.charAt(i)=='s') {
          sum += r;
        }
        if (t.charAt(i)=='p') {
          sum += s;
        }
      }

      boolean ansp = false;
      boolean ansr = false;
      boolean anss = false;

      for (int i = 0;i<n-k;i++ ) {
          if (t.charAt(i)==t.charAt(i+k)) {
            if (t.charAt(i)=='r') {
              if (ansr==false) {
                sum -=p;
                ansr=true;
              }else{
                ansr=false;
              }
            }
            if (t.charAt(i)=='s') {
              if (anss==false) {
                sum -=r;
                anss=true;
              }else{
                anss=false;
              }
            }
            if (t.charAt(i)=='p') {
              if (ansp==false) {
                sum -= s;
                ansp=true;
              }else{
                anss=false;
              }
            }

          }
        }
        System.out.println(sum);
      }

}
