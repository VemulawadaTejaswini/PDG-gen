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
      if(s.equals("JPY")){
        sum += money;
      }else{
        sum += money * 380000.0;;
      }
    }
    System.out.println(sum);
  }
}
