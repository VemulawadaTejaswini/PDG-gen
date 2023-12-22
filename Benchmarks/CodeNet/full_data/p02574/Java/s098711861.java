import java.util.*;

public class Main{
	public static void main(String[] $){
		var s=new Scanner(System.in);
		var n=s.nextInt();
		var a=new int[n];
		Arrays.setAll(a,i->s.nextInt());

		var p=new int[1000000];

		var pairwise=true;

		for(int v: a){
			for(int i=2;i<=v;++i){
				if((long)i*i>v){
					if(v>1&&++p[v] >= 2)
						pairwise=false;
					break;
				}
				if(v%i==0){
					if(++p[i] >= 2)
						pairwise=false;
					while(v%i==0)
						v/=i;
				}
			}
		}

		if(pairwise)
			System.out.println("pairwise coprime");
		else if(!Arrays.stream(p).anyMatch(i->i==n))
			System.out.println("setwise coprime");
		else
			System.out.println("not coprime");

	}
}
