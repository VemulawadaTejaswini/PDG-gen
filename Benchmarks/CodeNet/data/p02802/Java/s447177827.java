import java.util.*;

public class Atcoder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int correct=0;
		int penality=0;
		int[] a = new int[N]; 
		while(M-->0)
		{
			int i = sc.nextInt();
			String j = sc.next();
			if(j.contentEquals("AC")&&a[i]!=-1)
			{
				correct++;
				penality+=a[i];
				a[i]=-1;
			}
			else if(a[i]!=-1) {
				a[i]++;
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		System.out.println(correct+" "+penality);
	}
}
