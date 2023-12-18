import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int count = 0;

    for(int a = 1; a <= 9; a++){
      for(int b = 1; b <= 9; b++){
        if(a*b == N){
         count = count + 1;
        }
      }
    }
    if(count > 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}