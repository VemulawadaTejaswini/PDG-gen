import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			String s;
			String[][] a = new String[n][];
			int p;
			for(int i=0;i<n;i++){
				s = sc.next().replaceAll(":", " ").replaceAll(",", " ");
				a[i] = s.split(" ");
				p = a[i].length-1;
				a[i][p] = a[i][p].substring(0,a[i][p].length()-1);
				
			}
			
			ArrayList<String> list = new ArrayList<String>();
			for(int i=1;i<a[0].length;i++) list.add(a[0][i]);
			
			boolean flag;
			while(true){
				flag = false;
				for(int i=1;i<n;i++){
					if(list.contains(a[i][0])==true){
						flag = true;
						list.remove(list.indexOf(a[i][0]));
						for(int j=1;j<a[i].length;j++){
							if(list.contains(a[i][j])==false) list.add(a[i][j]);
						}
					}
				}
				if(flag==false) break;
			}
			
			System.out.println(list.size());
		}	
	}	
}