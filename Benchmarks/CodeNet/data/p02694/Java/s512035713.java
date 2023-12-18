import java.util.Scanner;


class Main{
 public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
   
  //X入力
  int X = stdIn.nextInt();
   
  double money = 100.0;
  int num = 0;
   
  for (int i =0 ; i < X; i++){
   money = money * 1.01;
   num = num + 1;
   if(money >= X )
     break;
  }
   System.out.println(num);
 }
}
