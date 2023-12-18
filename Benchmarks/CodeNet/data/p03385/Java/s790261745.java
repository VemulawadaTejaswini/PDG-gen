import java.util.Scanner;

public class Main{
public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
  String str = sc.next();
  boolean judge=false;
  sort(str,"abc");
  sort(str,"acb");
  sort(str,"bac");
  sort(str,"bca");
  sort(str,"cab");
  sort(str,"cba");
  if(judge)
    System.out.println("Yes");
  else
    System.out.println("No");
}
  void sort(String str,String A){
    if(!judge)
      judge = sc.equals(A);
  }
  
}
