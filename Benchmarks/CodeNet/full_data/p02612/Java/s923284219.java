import java.util.Scanner;

class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int money;
   if(n%1000 == 0){
    money = n;
   }else{
    money = ((n/1000)+1)*1000;
   }
   System.out.println(money-n);
  }
}

