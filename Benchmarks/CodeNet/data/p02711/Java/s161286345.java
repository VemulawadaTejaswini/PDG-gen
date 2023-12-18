import java.util.Scanner;
class Main{
  
  static void check_include_7(int number){
    if(number/100 == 7 || number % 10 == 7 || ((number % 100<=79)&&( number % 100 >= 70))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    check_include_7(number);
    scanner.close();
  }

}
