import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			LinkedList<String> list = new LinkedList<String>();
			LinkedList<String> r = new LinkedList<String>();	
			LinkedList<String> s = new LinkedList<String>();
			int[] p = new int[n];
			
			for(int i=0;i<n;i++){
				s.add(sc.next());
				p[i] = sc.nextInt();
			}
			
			int m = sc.nextInt();
			int a;
			String[][] q = new String[m][105];
			
			for(int i=0;i<m;i++){
				r.add(sc.next());
				a = sc.nextInt();
				for(int j=0;j<a;j++){
					q[i][j] = sc.next();
				}
			}
			list.add(sc.next());
			
			String t;
			int z;
			boolean flag = false;
			while(true){
				z = list.size();
				flag = false;
				for(int i=0;i<z;i++){
					t = list.pop();
					if(r.indexOf(t)!=-1){	
						a = r.indexOf(t);
						for(int k=0;;k++){
							if(q[a][k]==null) break;
							list.add(q[a][k]);
							flag = true;
						}
					}else{
						list.add(t);
					}
				}
				if(flag==false) break;
			}
			
			z = list.size();
			int sum = 0;
			for(int i=0;i<z;i++){
				t = list.pop();
				sum += p[s.indexOf(t)];
			}
			System.out.println(sum);
		}
	}	
}