import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = 0;
    while(n*(n+1)/2 < x) n++;
    System.out.println(n);
  }
}