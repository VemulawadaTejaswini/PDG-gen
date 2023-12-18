import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gint(){
		return Integer.parseInt(s.next());
	};
	public static void main(String[] $){
		boolean o=false;
		int n=gint();
		for(int i=0;i<n;++i)
			if(gint()%2==1)
				o=true;
		
		System.out.println(o?"first":"second");
	}
}
