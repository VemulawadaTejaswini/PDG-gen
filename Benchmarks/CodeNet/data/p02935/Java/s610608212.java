import java.util.*;
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int v[]=new int[n];
		for(int i=0;i<n;i++) {
			v[i]=sc.nextInt();
		}
		Arrays.sort(v);
		double ans=v[0];
		for(int i=1;i<n;i++) {
			ans=(v[i]+ans)/2.0;
		}
		System.out.println(ans);
	}

}
