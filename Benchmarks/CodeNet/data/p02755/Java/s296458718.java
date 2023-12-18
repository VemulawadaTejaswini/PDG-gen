import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = -1;

    for(int i = 0; i <= 1000; i++){
      int tax_a = (i * 8) / 100;
      int tax_b = (i * 10) / 100;

      if(tax_a == a && tax_b == b){
        ans = i;
        break;
      }
    }

    System.out.println(ans);
  }
}