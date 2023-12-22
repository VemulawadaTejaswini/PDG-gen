
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
		double a[]=new double[n];
		ArrayList<Double> aa=new ArrayList<>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();
			if(Math.ceil(a[i])==Math.floor(a[i])||(int)Math.ceil(a[i]*10000)==(int)Math.floor(a[i]*10000)) {
				aa.add(a[i]);
			}
		
		}
		int count=0;
	
			s:for(int i=0;i<aa.size();i++) {
			
				for(int j=i+1;j<aa.size();j++) {
				
					if((int)Math.ceil((aa.get(i)*aa.get(j)))==(int)Math.floor(aa.get(i)*aa.get(j))) {
						count++;
						
					}
				}
			}
			System.out.println(count);
		
	}

}
