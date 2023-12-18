import java.util.*;
public class Main {
      static Scanner sc=new Scanner(System.in);
      public static void main(String[] args) {
            int n=sc.nextInt();
            String s=String.valueOf(n);
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='7'){
                        System.out.println("YES");
                        return;
                  }
            }
            System.out.println("NO");
      }
}
