import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    long m = stdIn.nextLong();
    long[] a = new long[n];
    int cnt = 0;
    
    for(int i = 0; i < n; i++){
      a[i] = stdIn.nextLong();
      if(a[i] % m == 0){
        a[i] = 0;
        cnt++;
      }
      else{
        a[i] %= m;
      }
    }
    
    for(int i = 0; i < n; i++){
      long sum = a[i];
      for(int j = i + 1; j < n; j++){
        sum += a[j];
        if(sum % m == 0){
          sum = 0;
          cnt++;
        }
        else{
          a[i] %= m;
        }
      }
    }
    System.out.println(cnt);
    
  }
}