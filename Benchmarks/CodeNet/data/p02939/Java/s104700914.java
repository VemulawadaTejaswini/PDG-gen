import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		char[]t=s.next().toCharArray();
		int r=1;
		for(int i=1;i<t.length;++i,++r)
			if(t[i-1]==t[i])
				++i;
		System.out.println(r);
	}
}
