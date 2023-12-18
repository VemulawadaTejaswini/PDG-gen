import java.util.*;
public class Main{
  public static int sumOfDigits(int input){
    int sum = 0;
    while(input>0){
      sum+=input%10;
      input/=10;
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = sumOfDigits(n);
    String ans = "No";
    if(n%sum==0)ans="Yes";
    System.out.println(ans);
  }
}