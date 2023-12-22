import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] a = new int[N];

    for(int i = 0; i < N; i++){
      a[i] = Integer.parseInt(br.readLine());
    }

    int min = a[0];
    int max = a[1]-a[0];

    for(int i = 0; i < N-1; i++){
      if(i == N - 1){
        min = minv(min, a[i-1]);
        max = maxv(max, a[i] - min);
      }else{
        min =  minv(min, a[i]);
        max = maxv(max, a[i+1] - min);
      }
    }


    System.out.println(max);
  }

  public static int minv(int min, int a){
    if(min >= a){
      return a;
    }else{
      return min;
    }
  }

  public static int maxv(int max, int a){
    if(max <= a)return a;
    else return max;
  }

}