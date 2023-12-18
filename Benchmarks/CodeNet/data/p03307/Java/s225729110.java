import java.util.*;
 
class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int [] A = new int[N];
      int ans = 0;
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
      }
      int min = 100;
      int max = -1;
      for(int i=0;i<N;i++){
        if(A[i]>max){
          max = A[i];
        }
        if(A[i]<min){
          min = A[i];
        }
        System.out.println(max-min);
      }
    }
}
