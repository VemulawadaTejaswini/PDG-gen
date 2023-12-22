import java.util.Scanner;


class Main{
 public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
   
  //X入力
  int X = stdIn.nextInt();
   
  long money = 100;
  int num = 0;
   
  for (int i =0 ; i < X; i++){
   money = money + (money / 100);
   num = num + 1;
   if(money >= (long)X )
     break;
  }
   System.out.println(num);
 }
}
