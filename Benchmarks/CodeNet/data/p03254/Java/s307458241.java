import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int[] input = new int[N];
    int cnt=0;
    for(int i=0; i<N; i++){
      input[i] = sc.nextInt();
    }
    Arrays.sort(input);
    for(int j=0; j<N; j++){
      x=x-input[j];
      if(x>=0 && j!=N-1){
        cnt++;
      }else if(x==0 && j==N-1){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}