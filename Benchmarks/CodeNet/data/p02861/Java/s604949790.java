import java.awt.*;
import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Point[]a=new Point[n];
		Arrays.setAll(a,o->new Point(s.nextInt(),s.nextInt()));

		double r=0;
		for(int i=0;i<n;++i)
			for(int j=i+1;j<n;++j)
				r+=a[i].distance(a[j]);
		System.out.println(r*2/n);
	}
}
