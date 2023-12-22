public class Main {

  private static long power(long m, long n) {
    long res;
    long MODE = 1000000007;

    if (n == 0) {
      return 1;
    }
    res = power(m * m % MODE, n / 2);
    if (n % 2 == 1) {
      res = res * m % MODE;
    }
    return res;
  }

  public static void main(String[] args) {

    ArrayList inputs = new ArrayList();
    for (String string : args) {
      inputs.add(string);
    }

    long m = Long.parseLong((String) inputs.get(0));
    long n = Long.parseLong((String) inputs.get(1));

    System.out.println(power(m, n));
  }

}