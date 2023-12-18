	import java.util.*;
	
	
	
	public class Main {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			List<Integer> P = new ArrayList<Integer>();
			List<Integer> EP = new ArrayList<Integer>();
			List<Integer> sumEP = new ArrayList<Integer>();
			
			for (int i=0;i<N;i++) {
				P.add(sc.nextInt());
			}
		
			int Pi;
			
			int EPi;
			int sumEPi = 0;
			
			
			for (int i=1;i<=N;i++) {
				Pi = P.get(i);
				EPi = Pi*(Pi+1)/2/i;
				EP.set(i-1, EPi);				
				
			}
			
			for (int j=1;j<N;j++) {
				for (int l=j; l< j+K-2;l++) {
					sumEPi += EP.get(l);
				}
				
				sumEP.set(j-1, sumEPi);
			}
			
			int max = sumEP.get(0);
			
			for (int m = 1; m < sumEP.size(); m++) {
			    int v = sumEP.get(m);
			    if (v > max) {
			        max = v;
			    }
			}
			
			
			
			System.out.println(max);
			
		}
				
	}