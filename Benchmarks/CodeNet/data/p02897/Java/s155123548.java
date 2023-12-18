import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int o;
    if(n%2==0) o = n/2;
    else       o = n/2+1;
    double nn = (int)n;
    double oo = (int)o;
    System.out.println(oo/nn);
  }

}