import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt();
		for(int i=0,q=s.nextInt();i<q;++i) {
			if(i%2==0)
				b+=a/=2;
			else
				a+=b/=2;
		}
		System.out.println(a+" "+b);
	}
}
