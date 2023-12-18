package X1;
import java.util.*;
public class OrPlusMax {

	public static void main(String[] args) {
		Scanner Cf=new Scanner(System.in);
		int N=Cf.nextInt();
		int K=N;
		int[] values=new int[(int)Math.pow(2, N)];
		int[] ark=new int[(int)Math.pow(2, N)];
		for(int i=0;i<Math.pow(2, N);i++) {
			values[i]=Cf.nextInt();
			ark[i]=i;
			
		}
		
		ArrayList<ArrayList<Integer>> Bucket=new ArrayList<>();
		HashMap<Integer,Integer> Cover=new HashMap<>();
		for(int k=0;k<ark.length;k++) {
			Cover.put(ark[k],Integer.MIN_VALUE);
		}
		for(int i=0;i<ark.length;i++) {
			for(int j=0;j<ark.length;j++) {
				if(i<j) {
				int Julian=i|j;
				for(int X=Julian;X<ark.length;X++) { 
					if(Cover.get(X).intValue()<values[i]+values[j]) {
						Cover.put(X,values[i]+values[j]);
						//System.out.println(Julian+"  "+values[i]+"  "+values[j]);

						}
				}
				
				}
				}
		}
		
		for(int i=1;i<Cover.size();i++) {
			System.out.println(Cover.get(i).intValue()+"  ");
		}
		
		
		
		
		
	}

}
