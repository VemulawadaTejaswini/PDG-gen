import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力

      int money = sc.nextInt();
      int happy = 0;
      int happy1000 = 1000;
      int happy5 = 5;
      
      while(money >= 500)
      {
      happy = happy + happy1000;
        money -= 500;
      }
      while(money >= 5)
      {
      happy = happy + happy5;
        money -= 5;
      }

		System.out.println(happy);

	}
}