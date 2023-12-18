import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a[] = new int[K];
		for(int i=0;i<K;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		int min = 2;
		int max = 2;
		boolean success = true;
		for(int j=K-1;j>=0;j--) {
			if(a[j]>max) {
				success = false;
				System.out.println(-1);
				break;
			}
			int cmin;
			int cmax;
			if(a[j]>=min) {
				cmin = a[j];
			}else {
				int mod = min%a[j];
				cmin = (min/a[j]);
				if(mod>0)
					cmin++;
				cmin *= a[j];
			}
			cmax = cmin+(a[j]-1);
			if(cmax<min&&cmin>max) {
				success = false;
				System.out.println(-1);
				break;
			}
			
			max = cmax;
			min = cmin;
		}
		if(success) {
			System.out.println(min+" "+max);
		}
	}
}
