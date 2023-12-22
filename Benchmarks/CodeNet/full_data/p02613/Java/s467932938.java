import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    n = scan.nextInt();
    int c0 = 0;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    for (int i = 0; i < n; i++){
      string S = scan.next();
      if (S == "AC"){
        c0++;
      }else if (S == "WA"){
        c1++;
      }else if (S == "TLE"){
        c2++;
      }else if (S == "RE"){
        c3++;
      }
    }
  System.out.println("AC"+" "+"x"+" "+c0);
  System.out.println("WA"+" "+"x"+" "+c1);
  System.out.println("TLE"+" "+"x"+" "+c2);
  System.out.println("RE"+" "+"x"+" "+c3);
  }
}