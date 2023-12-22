import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			int[] a = new int[n];
			int[] b = new int[n];
			PriorityQueue<Integer> p = new PriorityQueue<Integer>();
			
			for(int i=0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				if(p.contains(b[i])==false) p.add(b[i]);
			}
			
			int x;
			int sum = 0;
			boolean flag = true;
			while(p.size()!=0){
				x = p.poll();
				for(int i=0;i<n;i++){
					if(x==b[i]){
						sum += a[i];
						if(sum>x){
							flag = false;
							break;
						}
					}
				}
				if(flag==false) break;
			}
			if(flag==true) System.out.println("Yes");
			else System.out.println("No");
		}	
	}	
}