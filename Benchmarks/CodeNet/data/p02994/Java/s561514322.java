import java.util.*;

class Main{
	public static int n, l;
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	n = sc.nextInt();
      	l = sc.nextInt();
      	
      	if(l > 0) {
      		System.out.println(sum(1));
      	}else if((l + n-1) < 0) {
      		System.out.println(sum(n));
      	}else {
      		System.out.println(sum(1-l));
      	}
    }
	
	public static int sum(int m) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(i == m) continue;
			//System.out.print(l+i-1);
			//System.out.println();
			sum += (l + i-1);
		}
		return sum;
	}
}