import java.util.Scanner;
public class Main {

  public static void main (String[]args) {
    Scanner sc = new Scanner(System.in);


    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 0;//求める総和

    for(int i = 1; i<=n; i++){
      int sum = findSumOfDigits(i); //n以下の整数の各位の和
      if(sum >= a && sum<=b){//n以下の整数の各位の和がa以上かつb以下か
        total +=i;
      }
    }
    System.out.println(total);
  }

    private static int findSumOfDigits(int n){//ある数の各位の和を求める
      int sum = 0;
      while(n>0){//0になるまで繰り返す
        sum += n%10;
        n /=10;
      }
      return sum;
    }




}
