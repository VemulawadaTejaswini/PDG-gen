import java.util.Scanner;

class Main{
  public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    if(num<10){
      System.out.println(num);
    }else if(num<100){
      System.out.println(9);
    }else if(num<1000){
      System.out.println(9+(num%100));
    }else if(num<10000){
      System.out.println(109);
    }else if(num<100000){
      System.out.println(109+(num&10000));
    }else{
      System.out.println(90909);
    }
  }
}