


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum =0;
		for(int i =0 ;i<n ;i++) {
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		Map<Integer,Integer> m = new HashMap();
		
		int q = sc.nextInt();
		while(q>0) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
//			m.put(b, m.getOrDefault(b, 0)+1);
			if(m.containsKey(c)) {
//				System.out.println("Inside contains");
				int i = m.get(b);
				m.put(b, i+1);
			}
			else {
				m.put(c, 1);
			}
			//System.out.println("map "+m.get(b));
			
			if(m.containsKey(b))
			sum = sum-b*m.get(b)+c*m.get(b);
			
			else
				sum=sum-b+c;
			System.out.println(sum);
				
				q--;
		}
		
	}

}
