import java.util.*;
public class Main {
  	public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	int plus = a + b;
      	int minus = a- b;
      	int multip = a * b;
      	if(plus >= minus || plus >= multip) {
          System.out.println(plus);
        } else if(minus >= plus || minus >= mutip) {
          System.out.println(minus);
        } else {
          System.out.println(multip);
        }
    }
}