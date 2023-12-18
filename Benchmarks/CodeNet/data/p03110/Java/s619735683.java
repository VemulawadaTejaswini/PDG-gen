import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum = 0;
    double money;
    String s;
    for(int i=0; i<n; i++){
      money = sc.nextDouble();
      s = sc.next();
      if(s.equals("BTC")){
        sum += money * 380000.0;
      }else{
        sum += money;
      }
    }
    System.out.println(sum);
  }
}
