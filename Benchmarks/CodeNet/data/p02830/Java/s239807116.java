import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    char[] t = sc.next().toCharArray();
    char[] u = new char[n * 2];
    for(int i = 0; i < n; i++){
      u[2 * i] = s[i];
      u[2 * i + 1] = t[i];
    }
    System.out.println(String.valueOf(u));

  }
}