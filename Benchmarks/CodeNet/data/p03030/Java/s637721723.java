import java.util.*;
import java.math.*;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String[] s = new String[n];
    String[] s2 = new String[n];
    int[] p = new int[n];
    int[] p2 = new int[n];
    for(int i = 0;i<s.length;i++) {
      s[i] = stdIn.next();
      p[i] = stdIn.nextInt();
      s2[i] = s[i];
      p2[i] = p[i];
    }
    for(int i = s.length-1;i>=0;i--) {
      for(int j = 0;j<i;j++) {
      int k = s2[j].compareTo(s2[j+1]);
      if(k>0) {
        String tep = s2[j];
        s2[j] = s2[j+1];
        s2[j+1] = tep;
        int tep2 = p2[j];
        p2[j] = p2[j+1];
        p2[j+1] = tep2;
      }
      k = s2[j].compareTo(s2[j+1]);
      if(k==0&&p2[j]<p2[j+1]) {
        String tep3 = s2[j];
        s2[j] = s2[j+1];
        s2[j+1] = tep3;
        int tep4 = p2[j];
        p2[j] = p2[j+1];
        p2[j+1] = tep4;
      }
    }
  }
  int[] count = new int[n];
  int tintin = 0;
    for(int i = 0;i<s.length;i++) {
      for(int j = 0;j<s.length;j++) {
        int k2 = s[i].compareTo(s2[j]);
        if(k2==0&&p[i]==p2[j]) {
          count[j] = i+1;
          tintin += 1;
        }
      }
    }
    for(int i = 0;i<count.length;i++) {
      System.out.println(count[i]);
    }

}
}