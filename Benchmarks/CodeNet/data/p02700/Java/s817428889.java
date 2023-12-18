import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    int d = s.nextInt();
    int turn = 0;
    while(a>0 && c >0){
        if(turn == 0){
            c -= b;
            turn = 1;
        }else{
            a -= d;
            turn = 0;
        }
    }
    if(a>0)
        System.out.println("Yes");
    else 
    System.out.println("No");
  }
}