import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final long X = sc.nextLong();
    sc.close();
    int counter = 0;
    long now = 100;
    while(now<X) {
    	now += (long)(now/100);
    	counter++;
    }
    System.out.println(counter);
  }
}