import java.util.Scanner;

  class Main{
    public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      double X = stdIn.nextDouble();
      int Y = 0;
      while(X <= 10){
        X /=;
        Y ++;
      }
      double Z = (10^Y)(X-1);
      switch(Y) {
        case 0: System.out.println(X);
        break;
        case 1; System.out.println(9);
        break;
        case 2; System.out.println(9+Z);
        break;
        case 3; System.out.println(909);
        break;
        case 4; System.out.println(909+Z);
        break;
        case 5; System.out.pritnln(90909);
        break;
      }
    }
  }