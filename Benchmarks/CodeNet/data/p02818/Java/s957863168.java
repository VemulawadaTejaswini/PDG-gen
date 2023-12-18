import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long a=scan.nextLong();
    long b=scan.nextLong();
    long num=scan.nextLong();
    long Ansa=0, Ansb=0;
    if(num<a){
      Ansa=a-num;
      Ansb=b;
    }else if(num<a+b){
      Ansa=0;
      Ansb=b-(num-a);
    }else{
      Ansa=0;
      Ansb=0;
    }
    System.out.println(Ansa+" "+Ansb);
  }
}