import java.util.*;
public class Main {
  public static int sumDigits(int c){
  	int sum = 0;
        //自然数の各桁の和を計算
        while(c > 0){
          //最右端のけたの獲得
          sum += c % 10;
          //最右端の桁を取り除く
          c = c / 10;
        }
    return sum;
  }
  
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  //整数の上限 
      int n= sc.nextInt();
      //和の下限
      int a = sc.nextInt();
      //和の上限
      int b = sc.nextInt();
      
      int total = 0;
      
      for(int i = 1; i <= n; i++){
        int sum = sumDigits(i);
        if(sum >= a && sum <= b){
          total += i;
        }
      }
      System.out.print(total);
    }
}