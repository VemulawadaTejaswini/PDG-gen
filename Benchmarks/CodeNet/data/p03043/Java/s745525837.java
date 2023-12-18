import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),k=s.nextInt();
		double r=0;
		for(int i=1;i<=n;++i) {
			double t=Math.max(0,Math.log(k/(double)i)/Math.log(2));
			r+=Math.pow(0.5,Math.ceil(t));
		}
		System.out.println(r/n);
	}
}