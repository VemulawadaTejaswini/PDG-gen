import java.util.*;

class Main{

	static void f(int i,int ex,ArrayList<HashMap<Integer,Integer>>l,int[]r){
		int c=1;
		for(Map.Entry<Integer,Integer> e: l.get(i).entrySet()){
			if(r[e.getKey()]>0)
				continue;
			if(c==ex)
				++c;
			r[e.getKey()]=c;
			f(e.getValue(),c++,l,r);
		}
	}

	public static void main(String[] $){
		final Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<HashMap<Integer,Integer>>l=new ArrayList<>();
		for(int i=0;i<n;++i)
			l.add(new HashMap<>());
		for(int i=0;i<n-1;++i){
			int a=s.nextInt()-1,b=s.nextInt()-1;
			l.get(a).put(i,b);
			l.get(b).put(i,a);
		}
		int[]r=new int[n-1];
		f(0,-1,l,r);
		System.out.println(Arrays.stream(r).max().getAsInt());
		for(int i:r)
			System.out.println(i);
	}
}
