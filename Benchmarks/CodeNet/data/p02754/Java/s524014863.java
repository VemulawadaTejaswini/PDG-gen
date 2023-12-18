import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.next();
      	int[] nab = s.split(" ");
        int n = nab[0];
        int a = nab[1];
        int b = nab[2];
        int c = a+b;
      	int d = n%c;
      	if(d>a) d = a;
        int e = n/c;
        int f = e*a+d;
        System.out.println(f);
    }
 
}