import java.util.Scanner;
class b {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n , m;
    n = sc.nextInt();
    m = sc.nextInt();
    int[] A = new int[n];
    int i , counter, sum;
    counter = 0;
    sum = 0;
    for(i=0; i < n ;i++){
      A[i] = sc.nextInt();
      sum += A[i];
    }
    for(i=0 ; i<n ; i++){
      if(A[i] >= sum / 4 / m){
        counter++;
      }else{
        continue;
      }
    }
    if(counter >= m){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
