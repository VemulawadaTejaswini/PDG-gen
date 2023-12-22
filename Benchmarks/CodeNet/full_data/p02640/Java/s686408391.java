import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x  =sc.nextInt();
    int y = sc.nextInt();
    String ans = "No";
    if((y-2*x)%2==0 && (4*x - y) >= 0){
    	ans = "Yes";
    }

    System.out.println(ans);
    sc.close();
  }
}
