import java.util.*;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(),b=s.nextInt(),c=s.nextInt(),x=s.nextInt()/50,r=0;
		for(int i=0;i<=a;++i) {
			for(int j=0;j<=b;++j) {
				int v=x-10*i-2*j;
				if(0<=v&&v<=c)
					++r;
			}
		}
		System.out.println(r);
	}
}