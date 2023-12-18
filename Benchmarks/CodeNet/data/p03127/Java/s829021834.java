import java.util.*;
public class Main {
	public static void main(String[] args){
		int m;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int A[]=new int [10*10*10*10*10*10*10*10*10*10*10*10];
		for(int i=0;i<a;i++) {
			A[i]=sc.nextInt();
		}
		double ans;
		double r = Math.random();
		ans = r * a;
		int s =(int)ans;	
		while(true) {
		r = Math.random();
		ans = r * a;
		m =(int)ans;
		if(s==m) {
			continue;
		}
		break;
		}
		A[m]=A[m]-A[s];
		int g;
		g=0;
		int j=0;
		for(int i=0;i<a;i++) {		
			if(A[i]>0) {
				g++;
				j=i;
			}		
		}
		if(g==1) {
			System.out.println(A[j]);
		}
	}
}