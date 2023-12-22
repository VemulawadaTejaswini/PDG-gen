import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int n,max=0,min=1000,sum=0,ave;
		
		while(true) {
			n = sc.nextInt();
			if (n==0) {
				break;
			}
			
			max=0;min=1000;sum=0;
			
			for (i=0 ; i<n ; i++) {
				int p = sc.nextInt();
				if (p>max) {
					max=p;
				}
if(p<min) {
					min=p;
				}
				sum += p;
			}
			
			sum -= max;
			sum -= min;
			ave = sum/(n-2);
			System.out.println(ave+"");
		}
	}
}
