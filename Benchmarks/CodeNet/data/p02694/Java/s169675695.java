public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long x = scan.nextLong();
    long tmp = 100;
    long cnt = 0;

    while (true) {
      cnt++;
      tmp += tmp * 1 / 100;
      if (tmp >= x) {
        System.out.println(cnt);
        return;
      }
    }

  }

}