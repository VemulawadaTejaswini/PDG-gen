import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[] $){
		int n=gInt(),k=gInt();
		int[]a=new int[n+1];
		for(int i=1;i<=n;++i)
			a[i]=gInt()+a[i-1];
		
		ArrayList<Integer>l=new ArrayList<>();
		for(int i=0;i<n;++i)
			for(int j=i+1;j<=n;++j)
				l.add(a[j]-a[i]);
		
		l.sort(null);
		
		int r=Integer.MAX_VALUE;
		for(int i=l.size()-k;i<l.size();++i) {
			r&=l.get(i);
		}
		System.out.println(r);
	}
}