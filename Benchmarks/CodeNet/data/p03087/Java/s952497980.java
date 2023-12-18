import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		for(int i = 0; i < q; i++){
			l[i] = sc.nextInt()-1;
			r[i] = sc.nextInt()-1;
		}
		int[] rui = new int[n];
		String ac = "AC";
		rui[0] = 0;
		for(int i = 1; i < n; i++){
			if(ac.equals(s.substring(i-1,i+1))){
				rui[i]++;
			}
			rui[i]+=rui[i-1];
		}
		System.out.println();
		for(int i = 0; i < q; i++){
			System.out.println(l[i]!=0?rui[r[i]]-rui[l[i]]:rui[r[i]]);
		}
	}
}
