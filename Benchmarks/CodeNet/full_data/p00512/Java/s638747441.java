import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		@SuppressWarnings("unchecked")
		ArrayList<String>[] a = new ArrayList[6];
		for(int i=0;i<6;i++) a[i] = new ArrayList<String>();
		String[][] b = new String[6][n];
		int[][] c = new int[6][n];
		

		String s;
		int m;
		int p;
		for(int i=0;i<n;i++){
			s = sc.next();
			m = sc.nextInt();
			p = s.length();
			if(a[p].indexOf(s)==-1){
				b[p][a[p].size()] = s;
				c[p][a[p].size()] = m;					
				a[p].add(s);

			}else{
				c[p][a[p].indexOf(s)] += m;
			}
		}
		
		for(int i=1;i<6;i++){
			Collections.sort(a[i]);
			for(int j=0;j<a[i].size();j++){
				for(int k=0;k<a[i].size();k++){
					if(a[i].get(j).compareTo(b[i][k])==0){
						System.out.println(b[i][k] + " " + c[i][k]);
						break;
					}
				}
			}
		}
	}	
}