import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        if(T.length() == S.length() + 1) {
          for(int i=0; i<T.length(); i++){
            if(T.charAt(i) == S.charAt(i)){
              String a = T.substring(T.length()-1);
              System.out.println("Yes");
              break;
            }
          }
        } else if (T.length() == S.length()) {
          System.out.println("No");
        } else {
          System.out.println("No");
        }
   }
}