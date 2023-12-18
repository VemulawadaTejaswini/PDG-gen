import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int m = sc.nextInt();

      int[] idata = new int[1000000];
      char[] cdata = new char[m];
      boolean[] ac = new boolean[1000000];
      int counta =0;
      int countw = 0;

      for (int i = 0;i<m ;i++ ) {
        idata[i] = sc.nextInt();
        String s = sc.next();
        if (ac[idata[i]]==false) {
          if (s.equals("WA")) {
            countw++;
          }
          if (s.equals("AC")) {
            ac[idata[i]]=true;
            counta++;
          }
        }

      }
      System.out.println(counta+" "+countw);
        }
      }
