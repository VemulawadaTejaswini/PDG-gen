import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int n = sc.nextInt();
    int sum = 0;
    for(int i = 0; i <= k; i++){
      for(int j = 0; j <= k; j++){
        if(n - i - j <= k && n - i - j >= 0){
          sum++;
        }
      }
    }
    System.out.println(sum);
  }
}