import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;



class Main {
  private static boolean[] eratos;

  private static void printPrime(int n) {
    eratos = new boolean[n+1];
    eratos[0] = false;
    eratos[1] = false;

    if (n <= 1) return;

    for (int i = 2; i <= n; i++) {
      eratos[i] = true;
    }   

    for (int i = 2; i <= n; i++) {
      int j = i;
      while (i * j <= n) {
        eratos[i * j] = false;
        j++;
      }   
    }   

    for (int i = 2; i <= n; i++) {
      if (eratos[i]) {
        System.out.println(i);
      }   
    }   


  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
    int N = sc.nextInt();
    printPrime(N);
    }   
  }
}