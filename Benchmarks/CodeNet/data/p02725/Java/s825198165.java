import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K=sc.nextInt();
    int N=sc.nextInt();
    int As[]=new int[N];
    for (int i=0;i<N;i++) {
      As[i]=sc.nextInt();
    }
    int result=As[1]-As[0];
    for (int i=1;i<N-1;i++) {
      result=As[i+1]-result;
    }

      System.out.println(result);
        }
      }
