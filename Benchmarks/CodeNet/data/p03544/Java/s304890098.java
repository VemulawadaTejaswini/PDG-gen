import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
	long[] number2 = new long[87];
    number2[0] = 2;
    number2[1] = 1;
    
    for(int i = 2; i < 87; i++){
      number2[i] = number2[i-1]+number2[i-2];
    }
    System.out.println(number2[number1]);
    scanner.close();
  }
}