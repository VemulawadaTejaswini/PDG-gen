import java.util.Scanner;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine().trim();

    String[] s1= new String[s.length()];
    for (int i = 0;i < s.length();i++) {
      s1[i] = s.substring(i,i + 1);
    }

    int num = -1;
    int num2 = -1;
    int cnt  = 0;
    int buf = 0;
    int cnt2 = 0;
    for ( int i = 0;i < s.length();i++) {
      if ("A".equals(s1[i])) {
        num = i;
        cnt2++;
      } else if ("C".equals(s1[i])) {
        num = i;
        cnt2++;
      } else if ("G".equals(s1[i])) {
        num = i;
        cnt2++;
      } else if ("T".equals(s1[i])) {
        num = i;
        cnt2++;
      }
      
      if (i != num ) {
      cnt =0;
      }
      if (i > 0 && num2 == num -1) {
        cnt++;
      }
      
      if (buf > cnt) {
        ;
      } else {
        buf = cnt;
      }
      
      num2 = num;
    }
    if (cnt2 == 1 && buf == 0) {
      System.out.println(1);
    } else if(buf == 0) {
      System.out.println(0);
    } else {
      System.out.println(buf + 1);
    }


  }

}