import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] array = new Integer[n];
		
		for(int i = 0; i < n; ++i) {
		    int tmp = sc.nextInt();
		    array[i] = tmp;
		}
		
		boolean flag = true;
		int counter = 0;
		
		for(int i = 0; i < n-1; ++i) {
		    for(int j = i+1; j < n; ++j) {
		        int tmp = array[i] - array[j];
		        
		        if(tmp < 0) {
		            flag = false;
		            break;
		        }
		    }
		    
		    if(flag) ++counter;
		}
		
		System.out.println(counter + 1);
	}
}