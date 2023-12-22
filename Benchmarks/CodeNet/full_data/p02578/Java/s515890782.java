import java.util.Scanner;
 
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int a, last, sum;
    last = sc.nextInt();
    sum = 0;
    for(int i = 1; i < N; i++){
      a = sc.nextInt();

      if(last>a){
        sum += (last - a);
      } else {
        last = a;
      }
    }
    System.out.println(sum);
  }
}
