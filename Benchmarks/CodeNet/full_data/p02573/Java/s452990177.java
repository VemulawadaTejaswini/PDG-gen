import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> la = new ArrayList<Integer>();
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int[][] a = new int[2][m];
		int yono = 1;
		for(int i = 0 ; i < m ; i++){
			for(int j = 0 ; j < 2 ; j++){
				a[j][i] = Integer.parseInt(sc.next());
				if(!al.contains(a[j][i])) al.add(a[j][i]);
			}
		}
		sc.close();
		while(!al.isEmpty()){
			la.add(al.get(0));
			boolean ebishu = true;
			while(ebishu){
				int ebi = 1;
				boolean ebiebi = true;
				for(int i = 0 ; i < m ; i++){
					if(la.contains(a[0][i]) && !la.contains(a[1][i])){
						la.add(a[1][i]);
						ebiebi = false;
						ebi++;
				    }
					if(la.contains(a[1][i]) && !la.contains(a[0][i])){
						la.add(a[0][i]);
						ebiebi = false;
						ebi++;
					}
				}
				yono = Math.max(ebi , yono);
				if(ebiebi) ebishu = false;
			}
			for(int i = 0 ; i < la.size() ; i++){
				boolean you = true;
				for(int j = 0 ; j < al.size() && you ; j++){
					if(la.get(i) == al.get(j)){
						you = false;
						al.remove(j);
					}
				}
			}
		}
		ou.print(yono + "\n");
		ou.flush();
    }
}