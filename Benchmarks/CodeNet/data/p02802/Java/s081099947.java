import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
      //①ACが一つでも出た個数を数える

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] idata = new int[m];
      char[] cdata = new char[m];
      boolean[] bdata = new boolean[m];
      int counta =0;
      int countw = 0;

      for (int i = 0;i<m ;i++ ) {
        idata[i] = sc.nextInt();
        String s = sc.next();
        cdata[i] = s.charAt(0);
      }
      for (int i = 0;i<m ;i++ ) {
        bdata[i] = false;
      }

      for (int i = 0;i<m ;i++ ) {
        if (bdata[i]==false) {
          if (cdata[i]=='W') {
            countw++;
          }
          if (cdata[i]=='A') {
            counta++;
            for (int j =0;j<m ;j++ ) {
              if (idata[j]==idata[i]) {
                bdata[j]=true;
              }
              }
            }
          }
        }
      System.out.println(counta+" "+countw);
        }
      }
