import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); int b = sc.nextInt();
    sc.close();
    int sum =0;
    sum += Math.max(a, b);
    if (a>=b) {a= a-1;}
    if (a<b) {b= b-1;}
    sum += Math.max(a, b);
      System.out.println(sum);
	}

}
