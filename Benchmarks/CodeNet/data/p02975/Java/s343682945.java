public class Main {
	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		int n=s.nextInt();
		long a[]=new long[n];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextLong();
		}
		System.out.println(calc(a)?"Yes":"No");

	}
	public static boolean calc(long a[]) {
		boolean used[]=new boolean[a.length];
		used[0]=true;
		for(int i=1;i<a.length;i++) {
			used[i]=true;
			for(int j=i+1;j<a.length;j++) {
				used[j]=true;
				boolean res = calc(a,used,a.length-3,a[0],i,j);
				if(res) {
					return true;
				}
				used[j]=false;
			}
			used[i]=false;
		}
		return false;

	}
	public static boolean calc(long a[],boolean used[],int remUsed,long prevVal,int nowInd,int nextInd) {
		if(remUsed==0) {
			return a[nowInd] == (prevVal ^ a[nextInd]);
		}
		if(a[nowInd] != (prevVal ^ a[nextInd])) {
			return false;
		}
		boolean res = false;
		for(int i=1;i<a.length;i++) {
			if(!used[i]) {
				used[i]=true;
				res = calc(a,used,remUsed-1,a[nowInd],nextInd,i);
				used[i]=false;
				if(res) {
					return res;
				}
			}
		}
		return res;
	}
}