import java.util.*;
import java.io.*;
class solution{
  public static void main(String str[]) {
    Scanner sc=new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length();
    int counta = 0;
    int countb = 0;
    for(int i= 0; i < len; i++) {
      if(str.charAt(i) == 'A') {
        counta += 1;
      }
      else {
        countb += 1;
      }
    }
    System.out.println((counta > 0 && countb > 0) ? "Yes" : "No");
  }
}