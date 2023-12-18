import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double[] money = new double[n];
    String[] syurui = new String[n];
    double sum = 0.0;
    for(int i=0; i<n; i++){
      money[i] = sc.nextInt();
      syurui[i] = sc.next();
      if(syurui[i] == "BTC"){
        sum += money[i] * 380000.0;
      }else{
        sum += money[i];
      }
    }
    System.out.println(sum);
  }
}
