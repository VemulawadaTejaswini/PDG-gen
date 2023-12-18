import java.util.Scanner;
class Main{
  static int Fizz_Buzz_Sum(int number){
    int sum = 0;
    for(int i = 1;i <= number;i++){
      if(i%3 == 0 || i%5 == 0){
      }else{
        sum += i;
      }
    }
    return sum;
  }
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(Fizz_Buzz_Sum(number));
  }
}