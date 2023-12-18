import java.util.*;
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<Sum> list = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
        	
        	list.add(new Sum(a,b));
        }
        
        Collections.sort(list);
        Collections.reverse(list);
        
        long sumA = 0;
        long sumB = 0;
        int count = 0;
        for (Sum s : list) {
        	if (count % 2 == 0) {
        		sumA += s.a;
        	} else {
        		sumB += s.b;
        	}
        	
        	count++;
        }
        
        System.out.println(sumA - sumB);
    }
    
    static class Sum implements Comparable<Sum> {
    	int a;
    	int b;
    	long sum;
    	
    	public Sum(int a, int b) {
    		this.a = a;
    		this.b = b;
    		this.sum = a + b;
    	}

		@Override
		public int compareTo(Sum o) {
			return this.a - o.a + this.b - o.b;
		}

		
    }
}