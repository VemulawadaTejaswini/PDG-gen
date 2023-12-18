import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		long r=s.nextInt(),d=s.nextInt(),x=s.nextInt();
		for(int i=0;i<10;++i) {
			x=x*r-d;
			System.out.println(x);
		}
	}
}