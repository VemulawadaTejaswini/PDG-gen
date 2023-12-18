import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S =sc.next();
      int s =S.length();
      int b =0;
       
      for(int i=0; i<s/2; i++){
        if(S.charAt(i)!=S.charAt(s-i-1)){
        b++;
      }
      }
      System.out.print(b);
    }
}