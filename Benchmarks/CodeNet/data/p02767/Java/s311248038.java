import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		Integer[] array = new Integer[n];
		
		for(int i = 0; i < n; ++i){
		    int tmp = sc.nextInt();
		    array[i] = tmp;
		}
		
		int sum = 0;
		
		Arrays.sort(array);
		
		int mini = 2147483647;
		boolean flag = true;
		
		for(int i = 0; i < n-1; ++i){
		    if(array[i] != array[i+1]) {
		        flag = false;
		        break;
		    }
		    else continue;
		}
		
		if(flag) System.out.println(0);
		else {
		for(int i = array[0] + 1; i < array[n-1]; ++i) {
		    for(int j = 0; j < n; ++j) {
		        int tmp = Math.abs((i-array[j]) * (i - array[j]));
		        sum += tmp;
		        
		    }
		    if(mini > sum) {
		        mini = sum;
		        sum = 0;
		    }
		    else sum = 0;
		}
		
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		
		System.out.println(mini);
		}
	}
}