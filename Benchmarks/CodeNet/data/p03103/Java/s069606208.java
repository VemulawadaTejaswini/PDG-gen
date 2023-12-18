import java.util.*;

class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    long ans = 0;
    long array[][] = new long[N][2];
    for (int i=0;i<N;i++){
      array[i][0] = sc.nextLong();
      array[i][1] = sc.nextLong();
    }
    Arrays.sort(array,(x,y)->Long.compare(x[0], y[0]));
    for (int i=0;i<N;i++){
      if (M>=array[i][1]){
        //買占め
        ans += array[i][0]*array[i][1];
        M -= array[i][1];
      }else{
        ans += array[i][0]*M;
        break;
      }
    }
    System.out.println(ans);
  }
}