import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(true){ 
			if(n == 0)break;
			System.out.println(min(n));
			n = sc.nextInt();
		}   
	}   
	static int min(int n){
		int min = Integer.MAX_VALUE;
		for(int c = n/500 ; c >= 0 ; c--){
			for(int b = (n-c*500)/300 ; b >= 0 ; b--){
				if((n-c*500-b*300)%200 == 0){ 
					int a = (n-c*500-b*300)/200;
					int cost = cost(a, b, c); 
					if(cost < min){
						min = cost;
					}   
				}   
			}   
		}   
		return min;
	}   
	static int cost(int a, int b, int c){
		return (a%5)*380+(a/5)*5*380*8/10+(b%4)*550+(b/4)*4*550*85/100+(c%3)*850+(c/3)*3*850*88/100;
	}   
}