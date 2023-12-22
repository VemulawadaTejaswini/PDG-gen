import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.valueOf(sc.next());
		int min=Integer.valueOf(sc.next());
		int dmax=-200000;
		
		for(int i=1;i<n;i++){
			int next=Integer.valueOf(sc.next());
			if(next<min)min=next;
			int d=next-min;
			if(d>dmax)dmax=d;
		}
		System.out.println(dmax);
	}
}