import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String s = sc.next();

      int lng = s.length();

      String ans = "Yes";

      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
        if(i%2==0 && c[i]=='L'){
          ans = "No";
        }
        if(i%2==1 && c[i]=='R'){
          ans = "No";
        }
      }

      System.out.println(ans);

    }
}
