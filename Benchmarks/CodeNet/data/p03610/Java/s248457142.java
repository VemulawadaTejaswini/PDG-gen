import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = new char[s.length()];
    for (int i = 0; i < s.length(); i ++){
    	c[i] = s.charAt(i);
    }
    for(int j = 0; j < s.length(); j += 2) {
    	System.out.print(c[j]);
    }
  }
}