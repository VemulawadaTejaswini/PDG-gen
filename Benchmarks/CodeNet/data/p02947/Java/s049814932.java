import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		
		int n=Integer.parseInt(scan.next());
		char[][]s=new char[n][10];
		String tmp;
		for (int i=0;i<n;++i) {
			tmp=scan.next();
			for (int k=0;k<10;++k) {
				s[i][k]=tmp.charAt(k);
			}
		}
		for (int i=0;i<n;++i) {
			Arrays.parallelSort(s[i]);
		}
		
		String[] s_sort =new String[n];
		
		for (int i=0;i<n;++i) {
			s_sort[i]=String.valueOf(s[i]);
		}
		Arrays.parallelSort(s_sort);

		long ans=0;
		long count=1;
		for (int i=0;i<n-1;++i) {
			if (s_sort[i].equals(s_sort[i+1])) { 
				++count;				
			}else {
				if (count>1) {
					ans+=count*(count-1)/2;
					
				}count=1;

			}
		}
		if (count>1) {
			ans+=count*(count-1)/2;
		}
		
		System.out.print(ans);
		

		
}
}
//end