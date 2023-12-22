import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);

	public static void main(String[] $){
		ArrayList<Integer> l=new ArrayList<>();
		while(true){
			int a=s.nextInt();
			if(a==0)
				return;
			int b=s.nextInt()-1;
			int c=s.nextInt()-1;

			l.clear();
			l.ensureCapacity(a);
			for(int i=1;i<=a;++i)
				l.add(i);
			
			while(l.size()>1) {
				l.remove(c);
				c=(c+b)%l.size();
			}
			System.out.println(l.get(0));
		}
	}
}
