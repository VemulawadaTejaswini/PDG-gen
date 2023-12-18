import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer=0;
    answer = (h-a)*(w-b);
    System.out.println(answer);
  }
  

  
}