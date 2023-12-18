import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int N = stdIn.nextInt();
    int M = stdIn.nextInt();
    int[] a = new int[N];
    int p = 0;
    int days = N;
   
    for(int i = 1; i<=M; i++){
      a[i] =  stdIn.nextInt();
      p += a[i];
    }
    
    days = N - p;
    
    if(days >= 0){System.out.print(days);}
    else{System.out.print(-1);}
  }
}