import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int count = 0;
    long sum = 0;
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    
    for(int j=0;M-count>0;j++){
        A[N-1] /= 2;
        count++;
        Arrays.sort(A);
      }
    
    for(int g=0;g<N;g++){
      sum += A[g];
    }
    System.out.println(sum);
  }
}