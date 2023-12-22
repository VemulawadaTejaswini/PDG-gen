import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] H = new int[N];
    boolean[] ii = new boolean[N];
    int[] A = new int[M];
    int[] B = new int[M];
    for(int i = 0; i<N;i++){
      H[i] = sc.nextInt();
      ii[i] = true;
    }
    for(int i = 0; i<M;i++){
      A[i] = sc.nextInt();
      B[i] = sc.nextInt();
    }
    for(int i = 0; i<M;i++){
      if(H[A[i]-1] == H[B[i]-1]){
        ii[B[i]-1] = false;
        ii[A[i]-1] = false;
      }else if(H[A[i]-1] > H[B[i]-1]){
        ii[B[i]-1] = false;
      }else{
        ii[A[i]-1] = false;
      }
    }
    int count = 0;
    for(int i=0;i<N;i++){
      // System.out.println(ii[i]);  
      if(ii[i]==true){

        count++;
      }
    }
    System.out.println(count);  
  }
}



