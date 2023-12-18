import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	long n = scanner.nextInt();int k=scanner.nextInt();
	char [] a;a=new char [k];
	for (int i=0;i<k;i++) {
		int x = scanner.nextInt();
		String s = String.valueOf(x);
		a[i]=s.charAt(0);
	}
	boolean d = true;
	while (d) {
		d=false;
		String s = String.valueOf(n);
		for (int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			for (int j=0;j<k;j++) {
				if (c==a[j]) {
					d=true;
					int t= s.length()-i-1;
					int g = (int)Math.pow(10, t);
					n+=g;
					i--;
				}
			}
		}
	}
	System.out.println(n);
	scanner.close();}}