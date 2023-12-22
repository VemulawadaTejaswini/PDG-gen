import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Main values = new Main(); 
		long a,b;
		while (sc.hasNext()){
			a = sc.nextLong();
			b = sc.nextLong();
			System.out.println(values.GCF(a, b)+" "+values.LCM(a, b));}
	}
	public long GCF(long a, long b) {
	    if (b == 0) return a;
	    else return (GCF (b, a % b));
	}
	public long LCM(long a, long b){
		return (a*b)/GCF(a,b);
	}
}