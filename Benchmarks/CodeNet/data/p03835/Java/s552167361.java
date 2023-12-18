import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int sum = 0;
    for(int i = Math.max(n - (2 * k), 0); i <= k; i++){
      sum += Math.min((i + k),n) - Math.max((n - k),i) + 1;
    }
    System.out.println(sum);
  }
}