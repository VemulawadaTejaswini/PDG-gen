import java.util.Scanner;

public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	Long va ;
	Long num ;
	long e = 0;
	long f = 0;
	e = b - a;
	if(e >0) {
	for(int i=0;i<=e;i++ ) {
	if (i==0) {
		f = a;
	}else {
	f = f^(a+i);
	}
	}
	}else {
		f = a;
	}
	System.out.println(f);
	sc.close();
}
}