import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextDouble();
    int b = sc.nextInt();
    int t = sc.nextInt();
    int answer=0;
    answer = b*((int)(t+0.5)/a);
    System.out.println(answer);
  }
  

  
}
