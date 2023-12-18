import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String s_former = s.substring(0,2);
    String s_latter = s.substring(2,4);
    if((Integer.parseInt(s_former)>=1 && Integer.parseInt(s_former)<=12) &&
       (Integer.parseInt(s_latter)>=1 && Integer.parseInt(s_latter)<=12))
      System.out.println("AMBIGUOUS");
    else if((Integer.parseInt(s_former)<=31 && !s_former.equals("00")) &&
            (Integer.parseInt(s_latter)>=1 && Integer.parseInt(s_latter)<=12))
      System.out.println("YYMM");
    else if((Integer.parseInt(s_latter)<=31 && !s_latter.equals("00")) &&
            (Integer.parseInt(s_former)>=1 && Integer.parseInt(s_former)<=12))
      System.out.println("MMYY");
    else
      System.out.println("NA");
  }
}