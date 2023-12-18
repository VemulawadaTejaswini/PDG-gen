import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    
    int digit = n % k;
    System.out.println(digit < k - digit ? digit : k - digit);
  }
}