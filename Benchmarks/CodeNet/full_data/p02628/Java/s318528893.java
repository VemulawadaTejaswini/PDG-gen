import java.util.Scanner;

class Main{
  public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    int [] p = new int[N-1];
    for(int i = 0; i < N; i++){
      p[i] = scan.nextInt();
    }
    
    for(int j = 0; j < N-1; j++){
      for(int l = j+1; l < N; l++){
        if(a[j] > a[l]){
          int k = a[j];
          a[j] = a[l];
          a[l] = k;
        }
      }
    }
    
    
    for(int m = 0; m < K; m++){
      sum += p[m];
    }
    
    System.out.println(sum);
  }
}        