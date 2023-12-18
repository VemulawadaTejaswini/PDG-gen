import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();
    int sumOne = firstNum;
    for(int i=1; i<secondNum; i++){
      sumOne = sumOne * 10 + firstNum;
    }
    int sumTwo = secondNum;
    for(int i=1; i<firstNum; i++){
      sumTwo = sumTwo * 10 + firstNum;
    }
    if(sumOne > sumTwo) System.out.println(sumOne);
    else System.out.println(sumTwo);
  }
}