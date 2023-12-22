public class Main {
  public static void main(String[] args) {
    int s = new java.util.Scanner(System.in).nextInt();
    int ss = s / 60;
    int sss = s % 60;
    int h = ss / 60;
    int m = ss % 60;
    System.out.println(h + ":" + m + ":" + sss);
  }
}