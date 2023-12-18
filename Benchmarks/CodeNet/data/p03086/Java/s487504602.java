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
    for ( int i = 0;i < s.length();i++) {
      if ("A".equals(s1[i])) {
        num = i;
      } else if ("C".equals(s1[i])) {
        num = i;
      } else if ("G".equals(s1[i])) {
        num = i;
      } else if ("T".equals(s1[i])) {
        num = i;
      }
      if (num2 == num -1) {
        cnt++;
      }else {
        if (buf > cnt) {
          ;
        } else {
          buf = cnt;
        }
        cnt =0;
      }
      num2 = num;
    }
    System.out.println(buf + 1);


    }

  }
