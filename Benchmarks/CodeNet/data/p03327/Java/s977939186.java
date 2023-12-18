import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double a = 5;
    double b = 4;
    double c = 0;
    double N = sc.nextDouble();
    if(N >= Math.pow(9,5)){
      N -= Math.pow(9,5);
      c ++;
    }else if(N >= Math.pow(6,6)){
       N -= Math.pow(6,6);
       c ++;
     }
      while(N>=6){
        if(N >= Math.pow(6,a)){
          N = N-Math.pow(6,a);
          c ++;
        }else if(N >= Math.pow(9,b)){
           N = N-Math.pow(9,b);
           c ++;
         }else{
            a --;
            b --;
          }
       }
    c += N;
    System.out.println(c);

  }
}
