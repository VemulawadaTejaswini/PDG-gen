import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int sum;
	int s;
	int e;
	
	if(a < c) {
	    s = c;
	} else {
	    s = a;
	}
	
	if(b < d) {
	    e = d;
	} else {
	    e = b;
	}
	
	if((e-s) < 0) {
	    System.out.println(0);
	} else {
	    System.out.println(e-s);
	}
	}
    }