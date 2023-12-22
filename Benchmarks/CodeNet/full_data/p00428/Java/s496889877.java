import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		int x,y;
		while(((x=Integer.parseInt(s.next()))|(y=Integer.parseInt(s.next())))!=0) {
			Element[] e = new Element[y];
			for(int i=0;i<y;++i)
				e[i]=new Element(i+1);

			for(int i=0;i<x;++i)
				for(int j=0;j<y;++j)
					e[j].v+=Integer.parseInt(s.next());
			Arrays.sort(e, (o1, o2) -> o2.v-o1.v);

			System.out.printf("%d ",e[0].n);
			for(int i=1;i<e.length;i++)
				System.out.printf("%d ",e[i].n);
			System.out.println();
		}
		System.out.println();
	}
}
class Element{
	int n;
	int v;
	Element(int i) {
		n=i;
	}
}