import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    long m = stdIn.nextLong();
    int cnt = 0;

    long sum[] = new long[n];
    for(int i = 0; i < n; i++){
      sum[i] = stdIn.nextLong();
      sum[i] %= m;
      if(sum[i] == 0)
        cnt++;
      
      for(int j = 0; j < i; j++){
        sum[j] += sum[i];
        sum[j] %= m;
        if(sum[i] == 0)
          cnt++; 
      }
    }

    System.out.println(cnt);
    
  }
}