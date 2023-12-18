import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    long m = stdIn.nextLong();
    long[] a = new long[n];
    int cnt = 0;

    a[0] = stdIn.nextLong();
    a[0] %= m;
    if(a[0] % m == 0)
      cnt++;
  

    long sum = a[0];
    for(int i = 1; i < n; i++){
      a[i] = stdIn.nextLong();
      a[i] %= m;
      if(a[i] == 0)
        cnt++;
      
      sum += a[i];
      sum %= m;
      if(sum == 0)
        cnt++;   
    }

    for(int i = 1; i < n; i++){
       sum = a[i];
      for(int j = i + 1; j < n; j++){
        sum += a[j];
        sum %= m;
        if(sum == 0)
          cnt++;
      }
    }
    
    System.out.println(cnt);
    
  }
}