import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    char[] alph = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    String s = "";
    while(n != 0) {
    	int i = (int) (n % 26);
    	n /= 26;
    	s += String.valueOf(alph[i-1]);
    }
    StringBuffer str = new StringBuffer(s);
    String ans = str.reverse().toString();
    System.out.println(ans);
  }
}