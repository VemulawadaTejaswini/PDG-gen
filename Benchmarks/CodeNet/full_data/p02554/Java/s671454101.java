import java.util.Scanner;
class Main {
  public static int N;
  public static final int l = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();

    long ans;
    long a = sum(10);
    long b = sum(9);
    long c = sum(8);

    System.out.println(a + " " + b + " " + c);
    ans = (a - b*2 + c) % l;
    System.out.println(ans);
  }

  public static long sum(int m) {
    long sum = 1;
    int i = 0;  //nankai kaketa?
    while(i < N) {
      for(int j = i; j < N; j++) {
        sum *= m;
        i++;
        //System.out.println(sum);
        if(sum > l) {
          sum = sum % l;
        }
      }
    }
    sum = sum % l;
    return sum;
  }
}
