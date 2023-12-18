import java.util.Scanner;

public class Main {
  	public static void main(String[] args){
      //入力値の取得
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.close();

      int answer = n/(a+b)*a;

      if (n%(a+b) <a) {
    	  answer+=n%(a+b);
      } else {
    	  answer+=a;
      }

      System.out.println(answer);
  	}
}