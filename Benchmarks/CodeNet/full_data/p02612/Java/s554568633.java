import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
      Scanner scan = new Scanner(System.in);
      int inputStr = scan.nextInt();//ここでコンソールに入力したものを取得
      // System.out.println("Hello World!");
      int money = 0;
      int otsuri = 0;
      for(int i=1; i<=10; i++){
        money = 1000*i;
        if(money-inputStr >= 0){
           otsuri = money-inputStr;
           break;
        }
      }
      System.out.println(otsuri);
    }
  
}