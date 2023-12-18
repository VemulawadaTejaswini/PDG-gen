import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    float num = 0;
    int i;
    float total = 0;
    for(i=1;i<=n;i++){
      num = (1/(sc.nextFloat()));
      total = total + num;
    }
    System.out.println(1/total);
  }
}