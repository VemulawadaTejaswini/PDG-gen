import java.util.Scanner;

public class Main{
public static void main(String[] args){
 static Scanner sc = new Scanner(System.in);
  boolean judge=false;
  sort("abc");
  sort("acb");
  sort("bac");
  sort("bca");
  sort("cab");
  sort("cba");
  if(judge)
    System.out.println("Yes");
  else
    System.out.println("No");
}
  void sort(String A){
    if(!judge)
      judge = sc.equals(A);
  }
  
}