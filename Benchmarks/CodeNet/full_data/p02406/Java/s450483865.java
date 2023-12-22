import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,x;
    x = sc.nextInt();
    for(i = 1;i <= x;i++){
      if(i % 3 == 0){
        System.out.print(" " + i);
      }
      else if((i - 3) % 10 == 0){
        System.out.print(" " + i);
      }
    }
    System.out.println();
  }
}