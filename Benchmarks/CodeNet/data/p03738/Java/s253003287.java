import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a_str = in.readLine();
    String b_str = in.readLine();
    boolean gt_flg = false;
    boolean ls_flg = false;
    
    if(a_str.length()>b_str.length())
      gt_flg = true;
    else if(a_str.length()<b_str.length())
      ls_flg = true;
    else {
      int a = 0;
      int b = 0;
      for(int i=0; i<a_str.length()-1; i++) {
        a = Integer.parseInt(a_str.substring(i,i+1));
        b = Integer.parseInt(b_str.substring(i,i+1));
        if(a!=b && a>b) {
          gt_flg = true;
          break;
        } else if(a!=b && a<b) {
          ls_flg = true;
          break;
        }
      }
    }
    
    if(gt_flg==true)
      System.out.println("GREATER");
    else if(ls_flg== true)
      System.out.println("LESS");
    else
      System.out.println("EQUAL");
  }
}