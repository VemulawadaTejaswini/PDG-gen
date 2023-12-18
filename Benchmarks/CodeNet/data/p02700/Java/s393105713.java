import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    String ans = "No";
    if((a+d-1)/d >= (c+b-1)/b)
      ans = "Yes";
    
    System.out.println(ans);
  }
}
