import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
          Long n = sc.nextLong();
    Long money = 100L;
    int y = 0;
    while(money < n){
      money += money/100;
      y++;
    }
    System.out.println(y);
    }
}