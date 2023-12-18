import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = sc.nextInt();
    String ans = "";
    while(N != 0){
      if(N%2 != 0){
        ans = "1"+ans;
        N--;
      }else{
        ans = "0"+ans;
      }
      N /= -2;
    }
    System.out.println(ans);
  }
}