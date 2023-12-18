import java.util.Scanner;

class TravelingBudget {
  public static void main(String args[]) {
  int A;
  int B;
  int C;
  int D;
  int E =0;
  int F =0;
  Scanner sc = new Scanner(System.in);

  System.err.print("A ");
  A = sc.nextInt();

  System.err.print("B ");
  B = sc.nextInt();

  System.err.print("C ");
  C = sc.nextInt();

  System.err.print("D ");
  D = sc.nextInt();

          if( A < B ) {
              E = A;
          };
          if( A >= B ) {
              E =B;
          };
          if( C < D ) {
              F = C;
          }
          if( C >= D ) {
              F = D;
          }
          sum =(E + F);
          System.out.println(E + F);


}
                      }
