import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		char[]t=s.next().toCharArray();

		ArrayList<TreeSet<Integer>>m=new ArrayList<>(26);
		for(int i=0;i<26;++i)
			m.add(new TreeSet<>());

		for(int i=0;i<n;++i)
			m.get(t[i]-'a').add(i);

		for(int q=s.nextInt();q>0;--q) {
			if(s.nextInt()==1) {
				int a=s.nextInt()-1;
				char b=s.next().charAt(0);
				if(t[a]!=b) {
					m.get(t[a]-'a').remove(a);
					m.get(b-'a').add(a);
				}
			}else {
				int a=s.nextInt();
				int b=s.nextInt();
				int c=0;
				for(TreeSet<Integer> o:m) {
					if(!o.subSet(a-1,b).isEmpty())
						++c;
				}
				System.out.println(c);
			}
		}
	}
}
