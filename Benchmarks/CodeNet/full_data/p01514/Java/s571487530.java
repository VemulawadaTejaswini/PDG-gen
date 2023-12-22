import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			if(n==0 && p==0 && r==0) break;
			
			int[] s = new int[n];
			int[] t = new int[n];
			int[][] map = new int[n][p];
			int a, b, c;
			String d;
			for(int i=0;i<r;i++){
				a = sc.nextInt()-1;
				b = sc.nextInt()-1;
				c = sc.nextInt();
				d = sc.next();
				
				if(d.compareTo("WRONG")==0) map[a][b]++;
				else{
					t[a] += map[a][b]*1200 + c;
					s[a]++;
				}
			}
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=p;i>=0;i--){
				for(int j=0;j<n;j++){
					if(s[j]==i && list.contains(t[j])==false) list.add(t[j]);
				}
				Collections.sort(list);
				for(int j=0;j<list.size();j++){
					for(int k=0;k<n;k++){
						if(t[k]==list.get(j)) System.out.println((k+1) + " " + i + " " + t[k]);
					}
				}
				list.clear();
			}
		}	
	}	
}