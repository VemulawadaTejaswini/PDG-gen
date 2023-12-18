import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long X = sc.nextLong();
    System.out.println(makeBurger(N,X));
  }




  public static long makeBurger(int N,long X){
    if(N == 0){
      return 1L;
    }else{
      if(X == 1L){
        return 0L;

      }else if(2L <= X && X <= pow(2L,N + 1) - 2L){
        return makeBurger(N - 1,X - 1);

      }else if(X == pow(2L,N + 1) - 1L){
        return pow(2L,N);
       
      }else if(pow(2L,N + 1) <= X && X <= pow(2L,N + 2) - 4L){
        return pow(2L,N) + makeBurger(N - 1,X - pow(2L,N + 1) + 1L);

      }else{
        return pow(2L,N + 1) - 1L;
      }
    }
  }

  public static long pow(long num,int power){
    long number = num;
    for(int i = 0;i < power - 1;i++){
      number *= num;
    }
    return number;
  }
}
