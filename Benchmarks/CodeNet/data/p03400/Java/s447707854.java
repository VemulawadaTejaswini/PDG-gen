import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),d=s.nextInt(),r=s.nextInt();
		for(int q=0;q<n;++q)
			for(int i=0,a=s.nextInt();i*a+1<=d;++i)
				++r;
		System.out.println(r);
	}
}
