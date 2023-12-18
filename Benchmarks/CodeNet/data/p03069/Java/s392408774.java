import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      String s = sc.next();
      int cnt = 0;
      for(int i = 0; i < s.length();) {
        if(s.charAt(i) == '.') { i++; continue; }

        int cntBlack = 0;
        while(i < s.length() && s.charAt(i) == '#') {
          cntBlack++; i++;
        }
        int cntWhite = 0;
        while(i < s.length() && s.charAt(i) == '.') {
          cntWhite++; i++;
        }
        cnt += Math.min(cntBlack, cntWhite);
      }
      System.out.println(cnt);
  }
}