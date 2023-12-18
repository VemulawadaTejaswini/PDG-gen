import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong(); // A*N + B*d(N) < X
    long B = sc.nextLong();
    long X = sc.nextLong(); //所持金

    int N = 0;
    int n = 0;

    long sum1 = (A*1000000000) + (B*10);
    long[] sum = new long[1000000000];
    for(int z = 0;z < 1000000000;z++){
      int length = (int)Math.log10(z) + 1;
      if (length > 19){
        break;
      }
      sum[z] = (A*z) + (B*length);
    }


    if(sum1 < X){
      System.out.println(1000000000);
      n++;
    }else{
    for(int i = 0;i < 1000000000;i++){
      if(sum[i] > X){
        N = i - 1;
        break;
      }
    }
  }

    if( N == 0 && n == 0){
      System.out.println(0);
    }else if(N != 0){
      System.out.println(N);
    }

  }
}
