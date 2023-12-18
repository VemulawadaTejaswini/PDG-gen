import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),l=(int)(Math.sqrt(n*4)),a=l*(l+1)/2;
		BitSet b=new BitSet(l);
		b.set(1,l+1);
		for(int i=n;i>0;--i){
			if(a-i>=n){
				a-=i;
				b.clear(i);
			}
		}
		b.stream().forEach(System.out::println);
	}
}