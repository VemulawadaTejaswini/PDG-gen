public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long sum = 1;
    for (int i = 0; i < n; i++) {
      long b = sc.nextLong();
      sum *= b;
    }
    if (sum > 1000000000000000000L) {
        sum = -1;
    }
    System.out.println(sum);
  }
}