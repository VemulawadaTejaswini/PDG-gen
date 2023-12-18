import java.util.Scanner;
class Question1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    check_include_7(number);
  }
  static void check_include_7(int number){
    if(number/100 == 7 || number % 10 == 7 || ((number % 100<=79)&&( number % 100 >= 70))){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
