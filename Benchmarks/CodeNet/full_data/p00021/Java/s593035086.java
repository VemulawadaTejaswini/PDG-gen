import java.util.Scanner;
import java.lang.Double;

class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0 ; i<num ; i++){
			Double a[] = new Double[8];
			Double b,c;
			for(int j=0 ; j<8 ; j++)
				a[j] = s.nextDouble();
			if((a[2]-a[0])!=0)
				b = (a[3]-a[1])/(a[2]-a[0]);
			else
				b = null;
			if((a[6]-a[4])!=0)
				c = (a[7]-a[5])/(a[6]-a[4]);
			else
				c = null;
			if(b==null || c==null){
				if(c==b)
					System.out.println("YES");
				else
					System.out.println("NO");	
				continue;
			}
			if(b.compareTo(c)==0)
				System.out.println("YES");
			else
				System.out.println("NO");		
		}
    }
}