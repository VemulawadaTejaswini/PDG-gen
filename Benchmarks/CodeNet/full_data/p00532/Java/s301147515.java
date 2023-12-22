import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] points=new int[s.nextInt()];
		int[] targets=new int[s.nextInt()];
		for(int i=0;i<targets.length;i++)
			targets[i]=s.nextInt();
		int c;
		for(int t:targets) {
			c=0;
			for(int j=0;j<points.length;++j) {
				if(t==s.nextInt())
					points[j]++;
				else
					c++;
			}
			points[t-1]+=c;
		}
		for(int i:points)
			System.out.println(i);
	}
}