import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] list;
		while(true) {
			int n = stdIn.nextInt();
			int w = stdIn.nextInt();
			if(n == 0 && w == 0) break;
			
			int max = 0;
			int[] log = new int[n];
			for(int i = 0; i < n; i++) {
				int a = stdIn.nextInt();
				log[i] = a;
				if(max < a) {
					max = a;
				}
			}
			
			list = new int[(int)Math.round(Math.ceil((double)max / (double)w))+1];
			max = 0;
			for(int i = 0; i < n; i++) {
				int a = log[i];
				for(int j = 0; j < list.length; j++) {
					if(a >= j*w && a < (j+1)*w) {
						list[j]++;
						if(list[j] > max) max = list[j];
						break;
					}
				}
			}
			double count = 0.0;
			n = list.length;
			for(int i = 1; i <= list.length; i++) {
				int a = list[i-1];
				count += ((double)((double)(n-i)/(double)(n-1.0)) * (double)((double)list[i-1]/(double)max));
			}
			count += 0.01;
			
			System.out.println(count);
		}
	}
		
}