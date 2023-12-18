import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		String S=scan.next();
		int count=0;
		for (int i=0;i<n;++i) {
			for (int j=i+1;j<n;++j) {
				for(int k=j+1;k<n;++k) {
					if (j-i==k-j)continue;
					if (S.charAt(i)!=S.charAt(j)&&
						S.charAt(i)!=S.charAt(k)&&
						S.charAt(j)!=S.charAt(k))++count;
				}
				
			}
		}
		System.out.print(count);

	
}
}
//end
