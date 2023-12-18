import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    String n = sc.next();
    int count = 0;
    for(int j = 0; j < n.length; j++)
      count += n.charAt(j);
    if(n % count == 0)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}