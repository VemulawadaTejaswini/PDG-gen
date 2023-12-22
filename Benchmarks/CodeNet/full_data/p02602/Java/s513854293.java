import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
  long A[]=new long[N];
  for(int i=0;i<N;i++){A[i]=scan.nextLong();}

  for (int i=K;i<N;i++){
      if (A[i-K]<A[i]){System.out.println("Yes");}
      else{System.out.println("No");}

  }

}
    }
