import java.util.Scanner;
public class Main{
  public static void main(String args[]){
 Scanner enter = new Scanner(System.in);
  int n = enter.nextInt();
  String s = String.valueOf(n);
  
  if(s.contains("7")){
    System.out.println("Yes");
  }
  else{
    System.out.println("No");
  }
  }
}