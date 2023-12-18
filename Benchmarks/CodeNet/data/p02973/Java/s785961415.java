import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String> ();
		int N = sc.nextInt();
		long a[] = new long[N];
		long b[] = new long[N];
		int colorCount =1;
		for (int i=0;i<N;i++) {
			a[i] =sc.nextLong();
		}
//		System.out.println(LocalTime.now());
		b[0] = a[0];
		long before =a[0];
		for (int i=1;i<N;i++) {
			if (before>=a[i]) {
				boolean isFind=false;
				long temp=1000000001;
				int tempj=0;
				for (int j=0;j<colorCount;j++) {
					if (b[j]<a[i]) {
						if (b[j]<temp) {
							temp=b[j];
							tempj=j;
						}
						isFind =true;
					}
				}
				if (isFind==false) {
					colorCount++;
					b[colorCount-1]=a[i];
				} else {
					b[tempj] =a[i];
				}
			}
			before=a[i];
		}
		System.out.println(colorCount);
//		System.out.println(LocalTime.now());
  	}

}