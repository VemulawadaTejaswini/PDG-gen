import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    int S, h, m, s;

    Scanner scan = new Scanner(System.in);

    S = scan.nextInt();
    h = S/3600;
    m = (S%3600)/60;
    s = (S%3600)%60;


    System.out.println(h +":"+ m +":" + s);

  }
}

