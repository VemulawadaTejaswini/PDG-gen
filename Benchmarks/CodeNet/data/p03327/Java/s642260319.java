import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = 0;
    String result = null;
    k = n / 1000;
    if(k<1){
      result = "ABC";
    }else
    if(1<k){
      result = "ABD";
    }
    System.out.println(result);
  }
}
