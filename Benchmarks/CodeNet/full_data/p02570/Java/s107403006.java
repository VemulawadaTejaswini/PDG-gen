public class fisrtA {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double d = in.nextInt();
    double t = in.nextInt();
    double s = in.nextInt();
    double last = d/s;
    if(last =< t) {
      System.out.print(Yes);
    }
    System.out.print(No);