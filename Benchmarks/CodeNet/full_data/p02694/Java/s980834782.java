import java.util.Scanner;


class Main{
 public static void main(String[] args){
  Scanner stdIn = new Scanner(System.in);
   
  //X入力
  int X = stdIn.nextInt();
   
  int money = 100;
  int num = 0;
   
   while ( money < X){
     money = money*101/100;
     num = num + 1;
   }
   System.out.println(num);
 }
}
