import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	int d = sc.nextInt();
	int e = sc.nextInt();
	int f = sc.nextInt();
	int g = 0;
	int ansA = 0;
	int ansS = 0;
	double conc = 0;
	for(int i=0; 100*a*i<=f; i++) {
		for(int j=0; 100*b*j<=f-100*a*i; j++) {
			for(int k=0; c*k<=f-100*a*i-100*b*j; k++) {
				for(int l=0; d*l<=f-c*k-100*a*i-100*b*j; l++) {
					g = 100 * a * i + 100 * b * j + c * k + d * l;
					if(g>0 && (double)(c*k+d*l)/g <= (double)e/(100+e) && conc <= (double)100*(c*k+d*l)/g) {
						conc = (double)100*(c*k+d*l)/g;
						ansA = g;
						ansS = c * k + d * l;
					}
				}
			}
		}
	}
	System.out.println(ansA);
	System.out.println(ansS);
}
}
