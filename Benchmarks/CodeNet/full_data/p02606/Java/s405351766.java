import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();

    //output
    int count = 0;
    for(int i = l; i <= r; i++){
      if( i % d == 0 ){ //if divisible
        count++;
      }
    }
    System.out.println(count);
  }
}
