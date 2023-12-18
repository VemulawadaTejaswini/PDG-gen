    import java.util.*;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		
    		int n = sc.nextInt();
    		long k = sc.nextInt();
    		
    		int[] num = new int[n];
    		int[] num2 = new int[n];
    		
    		for (int i = 0; i < n; i++){
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			num[i] = a;
    			num2[i] = b;
    		}
     
    		int count = 0;
    		int min = 0;
    		while (true){
    			if (count >= k){
    				break;
    			}
    			else{
    				min = 100001;
    				int abc = 0;
    				for (int i = 0; i < n; i++){
    					if (num[i] < min){
    						min = num[i];
    						abc = i;
    					}
    				}
    				num[abc] = 100001;
    				count += num2[abc];
    			}
    		}
    		System.out.println(min);
    	}
    }