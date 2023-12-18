import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long answer =0;
    Double N = sc.nextDouble();
    Double NN = Math.sqrt(N);
    long n = Math.round(NN);
    for(long i=n;i<=N;i++){
      if(N%i==0){
        long a = i;
        long b = (long)(N/i);
        answer = a+b-2;
        break;
      }
    }
    System.out.println(answer);
  }
}