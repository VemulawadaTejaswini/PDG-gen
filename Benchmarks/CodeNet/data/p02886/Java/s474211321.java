import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];

    int[] n = new int[N*(N-1)/2];
    int m = 0;

    for(int i=0; i<N; i++){
       for(int j=1; j<N; j++){
          for(int k=0; k<N*(N-1)/2; k++){

             n[k] = d[i]*d[j];
             m += n[k];
          }
       }
    }
    System.out.println(n);
  }
}