import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner sin = new Scanner(System.in);

    long sAll = sin.nextLong();

    long s = sAll % 60;
    long m = ((sAll - s) % 3600) / 60;
    long h = ((sAll - s) - m) / 3600;

    System.out.println(h + ":" + m + ":" + s);
  }
}
