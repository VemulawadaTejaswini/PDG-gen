import java.util.Scanner;

public class Main { public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int s = sc.nextInt();
  int m = s/60;
  int h = m/60;
  s = s-60*m
  m = m-60*h
  System.out.println(h + ":" + m + ":" + s);
  }
}