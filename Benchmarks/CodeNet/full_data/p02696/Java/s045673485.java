import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int max = 0;
    if(n < b) max = a*n/b;
    else max = a*(b-1)/b;
    System.out.println(max);
  }
}