import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long c = 0;
	long e = 0;
	long f = 0;
	e = b - a;
	for(int i=0;i<=e;i++ ) {
	if (i==0) {
		f = a;
	}else {
	c = a + i;
	f = f^c;
	}
	}
	System.out.println(f);
	sc.close();
}
}