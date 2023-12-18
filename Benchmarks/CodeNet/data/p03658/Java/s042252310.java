import java.util.*;

public class  Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int s=0;
		Integer a[]=new Integer[n];
		for(int i=0;i<n;i++)
			a[i]=input.nextInt();
		Arrays.sort(a,new Comparator<Integer>() {
			public int compare(Integer o1,Integer o2) {
				return o2-o1;
			}
		});
		for(int i=0;i<m;i++)
			s=s+a[i];
		System.out.println(s);
}
}