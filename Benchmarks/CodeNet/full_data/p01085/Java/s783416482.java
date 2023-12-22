import java.util.*;

class icpc2015a{
	public static void main(String[] args){
		
		ArrayList<Integer> n = new ArrayList<Integer>();
		for(;;){
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
			int n_min = sc.nextInt();
			int n_max = sc.nextInt();
			
			int[] p = new int[m];
			for(int i=0;i<m;i++){
				p[i] = sc.nextInt();
			}
			
			int a = 0;
			int b = 0;
			int c = 0;
			for(int j=n_min;j<=n_max;j++){
				c = p[0] - p[j-1];
				if(c>b){
					b = c;
					a = j;
				}
			}
			
			n.add(a);
			
			if(m==0&&n_min==0&&n_max==0){
				break;
			}
		}
		for(int k=0;k<n.size();k++){
			int nn = n.get(k);
			System.out.println(nn);
		}
	}
}
