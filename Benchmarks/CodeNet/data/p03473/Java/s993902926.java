import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    System.out.println(NewYear(s));
  }

  public static int NewYear (int m){
    return 48 - m;
  }
}
