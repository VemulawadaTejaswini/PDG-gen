import java.util.*;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){
		return Integer.parseInt(s.next());
	}

	public static void main(String[]$){
		int n=gInt(),m=gInt(),x=gInt();
		int l=0,r=0;
		for(int i=0;i<m;++i)
			if(gInt()<x)
				++l;
			else
				++r;
		System.out.println(Math.min(l,r));
	}
}