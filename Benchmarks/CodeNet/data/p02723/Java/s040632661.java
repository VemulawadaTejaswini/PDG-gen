import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    char[] arr = s.toCharArray();
    if(arr[2]==arr[3])
    {
      if(arr[4]==arr[5]){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }else{
        System.out.println("No");
      }
  }
}