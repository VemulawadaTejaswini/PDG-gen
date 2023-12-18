import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int k = s.nextInt();
    int n = s.nextInt();
    int[] a = new int[n];
    //a[0] = s.nextInt();
    int answer = 0;
    for(int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    if(n == 2) {
      answer = a[1]-a[0];
    } else {
      if(answer > (k-a[n]+a[0])) {
        answer = k-a[n]+a[0];
      }
      for(int i = 0; i < n-1; i++) {
        if(answer > (k-a[i]+a[i+1])) {
          answer = k-a[i+1]+a[i];
        }
      }
    }

    System.out.println(answer);
  }
}