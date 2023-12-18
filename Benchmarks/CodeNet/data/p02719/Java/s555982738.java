import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int k = sc.nextInt();
    boolean flag=true;
    int d=0;
    x=x%k;

    d=Math.min(x,Math.abs(x-k));

    System.out.println(d);
  }}
    