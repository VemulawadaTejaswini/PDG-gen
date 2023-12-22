import java.util.Scanner;
import java.util.HashMap;

class Main {
  public static void main(String[] args) {
    String line;
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextLine()) {
      line = sc.nextLine();
      int n = Integer.parseInt(line);
      int[] not_prime = new int[1000000];
      for(int i=0;i<1000000;i++) {
        not_prime[i]=0;
      }
      int count_prime = 0;
      for(int i=2;i<=n;i++) {
        if(not_prime[i]==1) {
          continue;
        }
        count_prime++;
        for(int j=i+i;j<=n;j+=i) {
          not_prime[j]=1;
        } 
      }
      System.out.println(count_prime);
    }
  }
}