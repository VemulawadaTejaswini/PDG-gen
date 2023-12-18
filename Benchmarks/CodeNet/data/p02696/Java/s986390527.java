import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	Long a = sc.nextLong();
    Long b = sc.nextLong();
    Long n = sc.nextLong();
    Long max;
    if(n < b) max = a*n/b;
    else max = b-1;
    System.out.println(max);
  }
}
