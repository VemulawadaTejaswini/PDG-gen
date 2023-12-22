import java.util.*;


public class Main {
	
	static int cnt(int[] a, int x){
		int cnt = 0;
		for(int i=0; i<a.length; i++)
			if(a[i] == x) cnt++;
		return cnt;
	}
	
	static int max(int[] a){
		int m = a[0];
		for(int i:a)
			if(m < i) m = i;
		return m;		
	}
	
	static int[] Idx(int[] a,int c,int m){
		int[] idx = new int[c];
		int j=0;
		for(int i=0; i<100; i++)
			if(a[i] == m) idx[j++] = i;
		return idx;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] data = new int[100];
		int[] jd = new int[100];
		for(int i=0; sc.hasNext(); i++){
			data[i] = sc.nextInt();
		}
		for(int i=0; i<100; i++){
			jd[i] = cnt(data,i+1);
		}
	    for(int i: Idx(jd,cnt(jd,max(jd)),max(jd))) System.out.println(i+1);
		
		

	}

}