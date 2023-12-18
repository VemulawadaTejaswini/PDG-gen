import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
      	int a = Integer.parseInt(sc.next());
      	int b = Integer.parseInt(sc.next());
        int c = a+b;
      	int d = n%c;
      	if(d>a) d = a;
        int e = n/c;
        int f = e*a+d;
        System.out.println(f);
    }

}