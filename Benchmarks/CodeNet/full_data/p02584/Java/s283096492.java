import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	
        // スタート
        long x = sc.nextLong();
      	x=Math.abs(x);//面倒なので絶対値を取ってしまう
      	//移動回数
      	long k = sc.nextLong();
      	//移動距離
      	long d = sc.nextLong();

      if(k<=x/d){
        System.out.println(x-k*d);
      }else{
        if((k-x/d)%2==0){
          System.out.println(x-d*(x/d));
        }else{
          System.out.println(Math.abs(x-d*(x/d+1)));
        }
      }
      
    }
}