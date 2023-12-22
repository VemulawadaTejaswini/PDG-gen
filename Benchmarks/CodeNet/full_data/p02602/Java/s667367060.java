import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int K = scan.nextInt();
      Integer[] arr = new Integer[N];
      Integer[] score = new Integer[N-K+1];
      int ans=1;
      for(int i=0;i<N;i++){
        int a = scan.nextInt();
        arr[i] = a;
      }
      
      for(int i=K-1;i<N;i++){
      	for(int j=0;j<K;j++){
          ans = ans * arr[i-j];
        }
        score[i-K+1] = ans;
        ans = 1;
      }
      
      for(int i=1;i<=N-K;i++){
        if(score[i-1]<score[i]){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
      
        
	}
}