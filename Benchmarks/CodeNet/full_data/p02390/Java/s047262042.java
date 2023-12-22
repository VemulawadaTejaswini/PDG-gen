import java.util.*;

class Main {
    static int S;
    static int m;
    static int h;
    static int s;

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      S = sc.nextInt();    
      h = S / 3600;
      m = S % 3600 / 60;
      s = S % 3600 % 60;
      System.out.println(h + ":" + m + ":" + s);
    }
}
