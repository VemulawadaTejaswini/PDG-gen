import java.util.*;

class Main{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] $){
		int n=s.nextInt(),t=s.nextInt(),a=s.nextInt();
		
		int index=-1;
		double eval=Double.MAX_VALUE;
		
		for(int i=0;i<n;++i) {
			double e=Math.abs(a-(t-0.006*s.nextInt()));
			if(e<eval) {
				index=i+1;
				eval=e;
			}
		}
		System.out.println(index);
	}
}