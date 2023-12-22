import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sr = new Scanner(System.in);
    int A = sr.nextInt();
    int B = sr.nextInt();
    int V = sr.nextInt();
    int W = sr.nextInt();
    int T = sr.nextInt();
    int time = (B-A)/(W-V);
    if (time <= T)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

}