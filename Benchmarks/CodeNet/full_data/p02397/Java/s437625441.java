import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();

	while(!(a == 0 && b == 0)){
	    if (a > b) {
		System.out.println(b + " " + a);
	    }
	    else {
		System.out.println(a + " " + b);
	    }
	    a = sc.nextInt();
	    b = sc.nextInt();
	}
    }
}