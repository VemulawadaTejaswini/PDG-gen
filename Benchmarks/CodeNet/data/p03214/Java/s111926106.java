import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[] $){
		int n=gInt();
		int[]a=new int[n];
		Arrays.setAll(a,i->gInt());
		
		int sum=Arrays.stream(a).sum();
		int v=0;
		for(int i=1;i<n;++i) {
			if(Math.abs(a[i]*n-sum)<Math.abs(a[v]*n-sum)) {
				v=i;
			}else if(Math.abs(a[i]*n-sum)==Math.abs(a[v]*n-sum)&&a[v]>a[i]){
				v=i;
			}
		}
		System.out.println(v);
	}
}