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
		int count=0;
		int ups=1;
		int ans_ups=1;
		boolean bool=false;
		for (int i=0;i<n-1;++i) {
			if (s_sort[i].equals(s_sort[i+1])) {
				++count;
				++ups;
				bool=true;
			}else if (bool){
				bool=false;
				if (ups>2) {
					ans_ups=1;

					for (int k=1;k<=ups;++k) {
						ans_ups*=k;
					
				}

				count=(count-ups+1)+(ans_ups/2);
				ups=1;
				ans_ups=1;
				}
				

			}
		}
		
		System.out.print(count);
		
}
}
//end