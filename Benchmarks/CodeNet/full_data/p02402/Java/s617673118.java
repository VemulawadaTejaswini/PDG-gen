import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int min =  Integer.MAX_VALUE;
    int max = -Integer.MAX_VALUE;
    long sum = 0;

      for(int i = 0; i < n; i++){

        int a = sc.nextInt();
        min = Math.min(min,a);
        max = Math.max(max,a);
        sum += a;

      }

    System.out.println( min + " " + max + " " + sum );

    } 
}
