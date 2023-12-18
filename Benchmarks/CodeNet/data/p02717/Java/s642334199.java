import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long k = sc.nextLong();
    boolean flag=true;
    long d=0;
    x=x%k;

    d=Math.min(x,Math.abs(x-k));

    System.out.println(d);
  }}
    