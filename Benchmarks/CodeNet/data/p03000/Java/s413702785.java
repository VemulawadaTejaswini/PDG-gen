import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),x=s.nextInt();

		int p=0;
		int r=1;
		for(int i=0;i<n;++i) {
			p+=s.nextInt();
			if(p<=x)
				++r;
		}
		System.out.println(r);
	}
}