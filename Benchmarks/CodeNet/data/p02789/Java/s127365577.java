import java.util.Scanner;

class A{
  public static void main(String args[]){
    Scanner scanner1 = new Scanner(System.in);
    int first = Integer.parseInt(scanner1.nextLine());
    Scanner scanner2 = new Scanner(System.in);
    int second = Integer.parseInt(scanner2.nextLine());
    if(first >= 1 && first <= 100 && second >= 0 && second <= first){
      if(first == second){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}
