import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			HashSet<Integer> h = new HashSet<Integer>();
			int[] a = new int[n];
			int max =0;
			
			for(int i=0;i<n;i++) {
				a[i] = sc.nextInt();
				max =Math.max(max, a[i]);
			}
			
			for(int i=0;i<n;i++) {
				h.add(a[i]);
			}
			
			int pat = h.size();
			
			if(k>=pat) {
				System.out.println(0);
				return;
			}
			
			int red = pat - k;
			
			ArrayList<Integer> num = new ArrayList<Integer>(max+1);
			
			for(int i=0;i<max+1;i++) {
				num.add(i, 0);
			}
			
			for(int i=0;i<n;i++) {
				int pula = num.get(a[i])+1;
				num.set(a[i], pula);	
				
			}



			Collections.sort(num);
			
			int rednum = 0;
			int ret = 0;

			int i =0;
			while(rednum<red) {
				if(num.get(i)>0) {
					rednum++;
					ret+=num.get(i);
				}
				
				i++;
			}
			
			System.out.println(ret);
		
	    }
				
	}
