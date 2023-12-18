import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int v=s.nextInt();
		BitSet m=new BitSet();
		m.set(v);
		for(int i=2;true;++i) {
			v=v%2==0?v/2:3*v+1;
			if(m.get(v)) {
				System.out.println(i);
				return;
			}
			m.set(v);
		}
	}
}