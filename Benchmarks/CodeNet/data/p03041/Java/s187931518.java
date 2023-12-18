import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n = Integer.parseInt(sc.next());
      int k = Integer.parseInt(sc.next());

      String s = sc.next();
      int lng = s.length();
      char[] c = new char[lng];
      for(int i=0;i<lng;i++){
        c[i] = s.charAt(i);
      }

      if(c[k-1]=='A'){
        c[k-1] = 'a';
      }
      if(c[k-1]=='B'){
        c[k-1] = 'b';
      }
      if(c[k-1]=='C'){
        c[k-1] = 'c';
      }

      for(int i=0;i<lng;i++){
        System.out.print(c[i]);
      }

    }
}
