import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int min = Math.min(Math.abs(a-b)+Math.abs(b-c),Math.abs(a-c)+Math.abs(c-b));
    min = Math.min(min,Math.abs(c-a)+Math.abs(a-b));
    System.out.println(min);
  }
}
