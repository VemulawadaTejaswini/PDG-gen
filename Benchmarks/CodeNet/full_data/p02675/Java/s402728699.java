import java.util.*;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String s = sc.next();
    int count = s.length();
    String add = "...";
    if(count > 100 || k > 100){
      System.out.println("error");
    }
    
    
    if(count <= k){
      System.out.println(s);
    }else{
      String result = s + add;
      System.out.println(result);
    }
  }
}