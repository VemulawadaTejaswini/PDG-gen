import java.io.InputStreamReader;
import java.io.BufferedReader;


class Main {
  public static void main(String[] args) throws Exception{
    
    //System.out.println("Hello Codiva");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int M = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int arr[][] = new int[N][M];
    int arr2[] = new int [M];
    for(int j =0 ; j<M ;j++){
        arr2[j] = Integer.parseInt(br.readLine());
      }
    int sum , count =0;
    for(int i=0 ; i<N ; i++){
       sum = 0 ;
      for(int j =0 ; j<M ;j++){
        arr[i][j] = Integer.parseInt(br.readLine());
        sum+=arr[i][j]*arr2[j];
      }
       if(sum+C > 0){
        count++;
      }

    }
    
    System.out.println(count);
    
    
  }
}
