import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int[] A = new int[N];
    for(int i = 0; i<N;i++){
      A[i] = Integer.parseInt(sc.next());
    }
    int count = 0;
    for(int i =0;i<N-1;i++){
      for(int j=i;j<N;j++){
        if(A[i]+A[j]==Math.abs(i-j)){
          count++;
        }
      }
    }
 
    System.out.println(count);  
  }
}



